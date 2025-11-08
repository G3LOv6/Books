Maven setup for Login_panels
=============================

This project contains compiled classes produced by NetBeans. To run the application with Maven you will need to provide the NetBeans form compatibility jar that contains `org.netbeans.lib.awtextra.AbsoluteLayout`.

Steps to run locally
1. Make sure Maven is on your PATH. Verify with:

   mvn -v

2. Locate the NetBeans jar that provides the form compatibility classes. Common names/locations:
   - Search your NetBeans installation for `org-netbeans-modules-form.jar` or a jar that contains `org/netbeans/lib/awtextra/AbsoluteLayout.class`.

3. Install that jar into your local Maven repository (example):

   mvn install:install-file -Dfile="C:\path\to\org-netbeans-modules-form.jar" -DgroupId=org.netbeans -DartifactId=org-netbeans-modules-form -Dversion=RELEASE -Dpackaging=jar

4. Add this dependency to `pom.xml` inside `<dependencies>`:

   <dependency>
     <groupId>org.netbeans</groupId>
     <artifactId>org-netbeans-modules-form</artifactId>
     <version>RELEASE</version>
   </dependency>

5. Build and run using the VS Code task or directly with Maven:

   mvn compile exec:java -Dexec.mainClass=login_panels.Login_panels

If you prefer not to use the local Maven repo, copy the NetBeans jar into a `lib/` folder in the project and run Java with the classpath including `lib/*` and `target/classes`.

If you want, tell me where NetBeans is installed (or allow me to search common locations) and I can try to find the correct jar and install it into your local repo automatically.

Organize project files
----------------------
There's a small PowerShell helper `organize-files.ps1` in the project root that will group files into folders by type (images, forms, classes, properties, libs, sources, other). To run it from VS Code: Terminal → Run Task → `Organize project files`, or from PowerShell:

```powershell
# from project root
powershell -ExecutionPolicy Bypass -File .\organize-files.ps1
```

The script skips common folders like `.vscode`, `build`, `target`, and `lib` when moving files.
