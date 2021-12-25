# Switch JDK in IDEA

We may need to use different versions of JDKs, thus it's very important to learn it.

When you need to switch JDK versions for your project, please open `File` - `Project Structure`,
select the JDK version you need, and press `OK`:

![idea-project-structure](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-project-structure.png)

If the JDK version you need is not in the list, you can click `Edit`, download a JDK or
select a JDK from your local machine:

![idea-add-jdk](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/idea-add-jdk.png)

Please keep in mind, you need to click `Reload` button in `Maven` window at top-right of IDEA to
reload the project whenever you make changes to project structure (add/remove dependencies, switch branches, switch JDKs, etc.).

![reload-maven-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/reload-maven-project.png)

Remember, this is very important, and you will use it a million of times in the future.
