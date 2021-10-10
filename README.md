# Git commands

`Notes:`
- Make sure all changes are pushed to current branch before switching to another branch or creating another branch

### Basic commands
```
git branch - show what branch you are on 
            - to exist after running this command : shift + : -> wq

git checkout BranchName - will switch to new branch
            
git checkout -b BranchName - will take all changed files and create a new branch with it
            
git clone url of the repo - will clone the repo to the current directory
        example : git clone https://github.com/mminhaz93/GitOverview     
        
git pull origin BranchName - pulls the latest code of  certain branch

git fetch - pulls the latest branches from git



git status - shows the status of git changes

git add . - will all the files with new changes

git commit -m "commit message" - gets ready to commit changes with message

git push - pushes the changes

** git reset --hard HEAD - don't use unless you want to discard all your current changes (tracked files)

git clean -df - will remove all changed files 
          -d: Remove untracked directories in addition to untracked files
          -f: Force (might be not necessary depending on clean.requireForce setting)     
```

### Create
```
git init
git add .
git commit -m "commit message"
git add origin url
git push -> will give a line to copy and paste
```

### Update
```
git add .
git commit -m "commit message"
git push
```

### .gitignore
- Add any file you will not want to push to git 

### Merge changes from Branch to Branch 
- You will need to create a pull request


