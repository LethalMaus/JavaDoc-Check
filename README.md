# JavaDoc-Check

This is a small Maven Project to test Checkstyle checks towards JavaDocs.

The idea is that for any project being completed by multiple developers, a check is in place to make sure they document their code via JavaDocs. The checks are simple enough and per default do not restrict the developers documentation style.

This helps towards documenting the code in general, helping new developers integrate faster & guaranteeing explanation of complex code to avoid bugs.
Paired alongside with JaCoCo & Lint ensures a high quality code standard.

To test is just run a Maven Build/Install

Definitions can be found in JavaDocCheck.xml

Results can be found in target/checkstyle-result.xml

The definitions are based on the developers using correct variable naming conventions.

Feel free to download, try it & change it
