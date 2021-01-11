# Developer
Remeber to add the antrl4 to your JDK classpath
## Setup antrl4 and grun
```
alias antlr4='java -jar /usr/local/lib/antlr-4.0-complete.jar'
alias grun='java org.antlr.v4.runtime.misc.TestRig'
```
## Generate Listener
```
/BB/gramatica$ antlr4 BB.g4 -encoding utf-8 -o ..\BBcompiler -package BBcompiler
```
## antlr4 rig test tool
```
/BB/.classes$ grun BB bb -gui -input-filename ./ejemplo.bb
```
## How to compile
```
/BB/.BBcompiler$ javac *.java -d ../.classes -classpath ..\libs\antlr-4.9.1-complete.jar;
```
## Execute test ejemplo.bb
```
/BB/.classes$ java BBcompiler.BB ..\ejemplo.bb
```
## create jar
```
/BB/$ jar cvfm BB.jar .\BBcompiler\META-INF\MANIFEST.MF ..\.classes\
```