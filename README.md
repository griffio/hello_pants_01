# hello pants

## [pants build](http://pantsbuild.github.io/jvm_projects.html)

Simplest Java example with multiple BUILD files, tests and transitive dependencies.

[install](http://pantsbuild.github.io/install.html)

~~~
curl -L -O https://pantsbuild.github.io/setup/pants && chmod +x pants && touch pants.ini
~~~	

~~~ bash
./pants run src/main/java:main
./pants test.junit --output-mode=ALL src/test/java:tests
~~~

### Test transitive dependencies

~~~
jar_library(name='google-test',
            jars=[
              jar('junit', 'junit', '4.12'),
              jar('com.google.guava', 'guava-testlib', '19.0'),
              jar('com.google.truth', 'truth', '0.25')
            ])
~~~
