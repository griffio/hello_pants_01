jvm_app(
	name='main',
	basename = 'hello-pants',
	dependencies = [
 	  ':main-bin'
  ],
)

jvm_binary(
	name = 'main-bin',
	main = 'griffio.Main',
	basename = 'hello-pants',
	dependencies = [
	  ':main-lib',
	],
)

java_library(
  name = 'main-lib',
  scope='default',
  sources = [
    'griffio/Main.java',
  ],
  dependencies = [
    'src/thrift/java:geo-lib',
  ]
)
