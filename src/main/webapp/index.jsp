<jsp:useBean id="greeter" class="org.gradle.sample.Greeter"/>
<html>
<p>${greeter.greeting}</p>
<p><%out.print(request.getLocalAddr())%></p>
</html>
