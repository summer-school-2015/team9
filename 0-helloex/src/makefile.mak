build:
	javac com/team/Hello.java

clean:
	del com/krinkin/summerpractice2015/hello/Hello.class

run: build
	java com.team.Hello