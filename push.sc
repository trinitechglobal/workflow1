read -p "Enter Commit Message" commit
git add .
git commit -m $commit
push -f origin workflow1
