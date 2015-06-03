build:
	javac com/team/HelloWorld.java

clean:
	del com/krinkin/summerpractice2015/hello/Hello.class

run: build
	java com.team.Hello