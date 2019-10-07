<%--
  Created by IntelliJ IDEA.
  User: Hp
  Date: 26.08.2019
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ctg" uri="customtags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#"><img
            src="<c:url value="/resources/images/navbar.jpeg" />"
            width="140" height="100" alt="fibonacci drawing"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ctg:if-user role="empty">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="#">About</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarLogin" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Sign in
                    </a>
                    <form class="dropdown-menu p-1" action="/signIn" method="POST">
                        <div class="form-group">
                            <label for="loginFormEmail">Email address</label>
                            <input type="email" class="form-control" id="loginFormEmail" name="email"
                                   placeholder="email@example.com">
                        </div>
                        <div class="form-group">
                            <label for="loginFormPassword">Password</label>
                            <input type="password" class="form-control" id="loginFormPassword" name="password"
                                   placeholder="Password">
                        </div>
                        <button type="submit" class="btn btn-dark">Sign in</button>
                    </form>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                       data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">
                        Sign up
                    </a>
                    <form class="dropdown-menu p-1" action="/signUp" method="POST">
                        <div class="form-group">
                            <label for="signUpName">Your name</label>
                            <input type="text" class="form-control" id="signUpName" name="name"
                                   placeholder="your name">
                        </div>
                        <div class="form-group">
                            <label for="signUpFormEmail">Email address</label>
                            <input type="email" class="form-control" id="signUpFormEmail" name="email"
                                   placeholder="email@example.com">
                        </div>
                        <div class="form-group">
                            <label for="signUpFormPassword">Password</label>
                            <input type="password" class="form-control" id="signUpFormPassword" name="password"
                                   placeholder="Password">
                        </div>
                        <button type="submit" class="btn btn-dark">Sign up</button>
                    </form>
                </li>
            </ul>
            <ul class="navbar-nav navbar-right">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown1" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Language
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=Ukrainian&path=${pageContext.request.servletPath}" />">Слава
                            Україні</a>
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=English&path=${pageContext.request.servletPath}" />">Glory
                            to Ukraine</a>
                        <a class="dropdown-item" href="<c:url value="/WEB-INF/jsp/errors/lang.jsp" />">Слава Украине</a>
                    </div>
                </li>
                <li>
                    <a class="nav-link" href="#">Something else</a>
                </li>
            </ul>

        </ctg:if-user>
        <ctg:if-user role="visitor">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/controller?command=RETURN_TO_HOMEPAGE" />">Home<span
                            class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/controller?command=GET_ALL_THEMES" />">Calendar</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/controller?command=GO_TO_GET_ALL_TICKETS" />">My
                        tickets</a>
                </li>
            </ul>
            <ul class="navbar-nav navbar-right">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownVisitor2" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Language
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=Ukrainian&path=${pageContext.request.servletPath}" />">Слава
                            Україні</a>
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=English&path=${pageContext.request.servletPath}" />">Glory
                            to Ukraine</a>
                        <a class="dropdown-item" href="<c:url value="/WEB-INF/jsp/errors/lang.jsp" />">Слава Украине</a>
                    </div>
                </li>
                <form class="form-inline" action="/signOut" method="POST">
                    <button type="submit" class="btn btn-dark">Sign Out</button>
                </form>
            </ul>
            <span class="navbar-text">
            <%@ include file="/WEB-INF/jsp/components/header.jsp" %>
        </span>
        </ctg:if-user>
        <ctg:if-user role="administrator">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="<c:url value="/controller?command=RETURN_TO_HOMEPAGE" />">Home<span
                            class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/controller?command=GO_TO_STATS_COMMAND" />">Statistics</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown3" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Menu
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown3">
                        <a class="dropdown-item" href="<c:url value="/controller?command=GET_ALL_THEMES" />">Themes</a>
                        <a class="dropdown-item" href="<c:url value="/controller?command=ADD_NEW_THEME" />">New
                            theme</a>
                        <a class="dropdown-item" href="<c:url value="/controller?command=GET_ALL_SHOWROOM" />">Expo</a>
                        <a class="dropdown-item" href="<c:url value="/controller?command=ADD_NEW_EXPO" />">New expo</a>
                    </div>
                </li>
            </ul>
            <ul class="navbar-nav navbar-right">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownAdmin2" role="button"
                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Language
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=Ukrainian&path=${pageContext.request.servletPath}" />">Слава
                            Україні</a>
                        <a class="dropdown-item"
                           href="<c:url value="/controller?command=LOCALIZATION&language=English&path=${pageContext.request.servletPath}" />">Glory
                            to Ukraine</a>
                        <a class="dropdown-item" href="<c:url value="/WEB-INF/jsp/errors/lang.jsp" />">Слава Украине</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/signOut" />">Sign out</a>
                </li>
            </ul>
            <span class="navbar-text">
            <%@ include file="/WEB-INF/jsp/components/header.jsp" %>
        </span>
        </ctg:if-user>
    </div>
</nav>

