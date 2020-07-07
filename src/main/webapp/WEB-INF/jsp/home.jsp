<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Web app</title>
    <link href="<jstl:url value='/resources/CSS/home.css '/>" rel="stylesheet" />
</head>
<body>
    <div class="header">
        <div class="blueBorder">
            <a type="button">News</a>
            <a type="button" class="headerAboutDictionaryButton">About dictionary</a>
            <a type="button">Help</a>
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter" id="RegButton">
                Register
            </button>

        </div>

        <h1>Urban Dictionary</h1>
        <p>Search and add new words in dictionary!</p>
        <form action="/WordsForm" method="POST" >
            <input type="submit" value="add words" id="addWordsButton"/>
        </form>
        <!--  <input type="submit" value="add word" name="addWordsForm" id="addWords"/> -->
          <jstl:out value="${successMessage}"/>

      </div>
    <jsp:include page="form.jsp"/>
  </body>
  </html>
