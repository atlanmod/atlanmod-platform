#!/bin/bash

# Updates a single submodule
update_sub() {
    root_dist=$(echo $1 | grep -o "/" | wc -l)
    cd $1
    git submodule update --init
    i=0
    while [ $i -le $root_dist ]
    do
        cd ..
        ((i++))
    done
}

main() {
    submods=$(grep "path = " .gitmodules | cut -c9-)
    for sub in $submods
    do
        update_sub $sub
    done
}

main