package DefaultScannJarFileExtra;

import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class DefaultScannJarFileExtra {

	public static void main(String[] args) {
		
	}
	
	protected void scanJarFile( ClassLoader classloader, JarFile file ) {
		Enumeration< JarEntry > entries = file.entries();
		while( entries.hasMoreElements()) {
			JarEntry entry = entries.nextElement();
			if(entry.isDirectory() || entry.getName().equals(JarFile.MANIFEST_NAME)){
				continue;
			}
			Object resources;
			//resources.get(classloader).add(entry.getName());
		}
	}

}
