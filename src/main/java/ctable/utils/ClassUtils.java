package main.java.ctable.utils;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author longw
 *
 */
public class ClassUtils {
	
	public static Set<Class<?>> getAllClass(String pack){
		//需要返回的class的集合
		Set<Class<?>> classes = new LinkedHashSet<Class<?>>(); 
		// 是否循环迭代  暂时保留不使用
		boolean recursive = true;
		// 获取包的名字 并进行替换
		String packageName = pack;
		String packageDirName = packageName.replace('.', '/');
		// 定义一个枚举的集合 并进行循环来处理这个目录下的things
		Enumeration<URL> dirs;
		try {
			dirs = Thread.currentThread().getContextClassLoader().getResources(packageDirName);
			while (dirs.hasMoreElements()) {
				URL dir = dirs.nextElement();
				// 得到协议的名称
				String protocol = dir.getProtocol();
				if ("file".equals(protocol)) {
					// 获取包的物理路径
					String filePath = URLDecoder.decode(dir.getFile(), "UTF-8");
					// 以文件的方式扫描整个包下的文件 并添加到集合中
					findAndAddClassesInPackageByFile(packageName, filePath, recursive, classes);
				}
				//System.out.println(dir.getProtocol()+"-----"+dir.getPath());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return classes;
	}
	
	public static void findAndAddClassesInPackageByFile(
			String packageName,
			String packagePath,
			final boolean recursive,
			Set<Class<?>> classes){
		// 获取此包的目录 建立一个File
		File dir = new File(packagePath);
		// 如果不存在或者 也不是目录就直接返回
		if (!dir.exists() || !dir.isDirectory()) {
			// log.warn("用户定义包名 " + packageName + " 下没有任何文件");
			return;
		}
		// 如果存在 就获取包下的所有文件 包括目录
		File[] dirfiles = dir.listFiles(new FileFilter(){

			// 自定义过滤规则 如果可以循环(包含子目录) 或则是以.class结尾的文件(编译好的java类文件)
			public boolean accept(File file){
				return (recursive && file.isDirectory()) || (file.getName().endsWith(".class"));
			}
		});
		// 循环所有文件
		for (File file : dirfiles){
			// 如果是目录 则继续扫描
			if (file.isDirectory()) {
				findAndAddClassesInPackageByFile(packageName + "." + file.getName(), file.getAbsolutePath(), recursive, classes);
			}else{
				// 如果是java类文件 去掉后面的.class 只留下类名
				String className = file.getName().substring(0, file.getName().length() - 6);
				try{
					// 添加到集合中去
					// classes.add(Class.forName(packageName + '.' +
					// className));
					classes.add(Thread.currentThread().getContextClassLoader().loadClass(packageName + '.' + className));
				}catch (ClassNotFoundException e){
					// log.error("添加用户自定义视图类错误 找不到此类的.class文件");
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Set<Class<?>> cl = getAllClass("main.java.spring");
		for (Iterator iterator = cl.iterator(); iterator.hasNext();) {
			Class<?> class1 = (Class<?>) iterator.next();
			System.out.println(class1.getName());
		}
		
	}
	
}
