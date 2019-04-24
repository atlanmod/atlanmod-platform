#!/bin/bash

# Updates a single submodule
update_sub() {
    cd $1
    git submodule update --init
    cd ..
}

main() {
    submodules=$(cat .gitmodules | grep "path = " | cut -c9-)
    for sub in $submodules
    do
        update_sub $sub
    done
}

main