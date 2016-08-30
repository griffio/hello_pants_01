# hello_pants_01

pants build

[install](http://pantsbuild.github.io/install.html)

~~~
curl -L -O https://pantsbuild.github.io/setup/pants && chmod +x pants && touch pants.ini
~~~	

~~~ bash
./pants run src/main/java:main
./pants test.junit --output-mode=ALL src/test/java:tests
~~~
