read -p "Enter Commit Message: " commit
git add .
git commit -m $commit
git push -f origin workflow1
