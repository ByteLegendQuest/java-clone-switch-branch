# Switch `git` branches in IDEA

You can use **either way** below to switch `git` branches in IDEA:

## IDEA GUI

Click branch icon at right-bottom of IDEA, which says we're currently on default `main` branch.
Select `origin/jdk17` - `Checkout`:

![switch-branch-in-idea-gui](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-gui.png)

IDEA will prompt `Checked out new branch jdk17 from origin/jdk17`, which proves it's done successfully:

![switch-branch-in-idea-gui-success](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-gui-success.png)

## Terminal in IDEA（Terminal/`git-bash`/`cmd`）

Click `Terminal` tab at the bottom of IDEA and input`git checkout jdk17`.
If it says `Branch 'jdk17' set up to track remote branch 'jdk17' from 'origin'`, the branch is switched successfully:

![switch-branch-in-idea-terminal](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/switch-branch-in-idea-terminal.png)

# Post Steps after Branch Switching

Please keep in mind, you need to click `Reload` button in `Maven` window at top-right of IDEA to
reload the project whenever you make changes to project structure (add/remove dependencies, switch branches, switch JDKs, etc.).

![reload-maven-project](https://raw.githubusercontent.com/ByteLegendQuest/java-clone-switch-branch/main/docs/reload-maven-project.png)

Remember, this is very important, and you will use it a million of times in the future.
