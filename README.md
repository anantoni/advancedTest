        java -cp soot-2.5.0.jar soot.advancedTest.Main  -p jb use-original-names:true -p jb.ulp unsplit-original-locals:true -p jb.lns only-stack-locals:true -d original-names-advancedTest.Main-2.5.0 -f J -cp .:/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rt.jar advancedTest.Main
  
        java -cp ~/repos/soot/lib/soot-trunk.jar soot.Main -p jb use-original-names:true -d trunk-test -f J -cp build/libs:/usr/lib/jvm/java-7-openjdk-amd64/jre/lib/rt.jar -process-dir build/libs/advancedTest-1.0.jar
