#!/bin/sh

if [ "$#" == 1 ]
then
    mvn versions:set -DnewVersion=$1
fi
find . -name *Backup|xargs rm -rf
