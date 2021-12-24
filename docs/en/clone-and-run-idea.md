# Clone, Import, and Run a Project in IntelliJ IDEA

Since you have passed the `git version` challenge before, your `git` should be installed correctly.
Now open your terminal (`Terminal`, `git-bash`, `cmd`, etc.) and input:

`git clone https://github.com/ByteLegendQuest/java-clone-switch-branch`

A project directory named `java-clone-switch-branch` will be created, which can be moved wherever you like.

Open `IDEA`, `File` - `Open`, select and open the `pom.xml` in `java-clone-switch-branch` directory which is created just now.
Because `pom.xml` is the entrance of a Maven project, IDEA will ask you if you would like to open the project.
Click `Open as Project`:

![idea-open-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-open-project.png)

If this is the first time for your IDEA to open a Java project, it might complain no JDK configured.
Please open `File` - `Project Structure`, if there's a "No JDK" error, click `Edit` button and
add the JDK that you have downloaded into IDEA.

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

Wait for the project to be imported. Open `src/main/java/com/bytelegend/Main.java` you'll see two green triangle button.
Click either of them, select `Run Main.main()`, the program will run and print the answer into standard output below.

![idea-run-main](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-run-main.png)

The string is the answer for this challenge. Keep on and good luck in your hero journey!
