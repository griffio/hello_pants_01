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
	':main-lib'
	],
	)

java_library(
        name = 'main-lib',
        sources = [
        'griffio/Main.java'
        ],
        dependencies = [
        'src/hello/java:hello-lib'
        ]
        )
