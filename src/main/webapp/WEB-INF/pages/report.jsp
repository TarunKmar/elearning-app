<%@ page  isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<c:choose>
   <c:when test="${!empty empsList}">
       <table  border="1"  bgcolor="cyan"  align="center"> 
                <tr bgcolor="pink">
                   <th>eno </th> <th>ename </th> <th>desg</th> <th>salary </th> <th>deptNo </th> 
                </tr>
                <c:forEach var="emp"  items="${empsList}">
                     <tr>
                        <td>${emp.empno} </td>
                        <td>${emp.ename}</td>
                        <td>${emp.job}  </td>
                        <td>${emp.sal}  </td>
                        <td>${emp.deptno}  </td>
                        
                        <td><a href="edit_employee?eno=${emp.empno}">EditEmployee</a></td>
                         <td><a onclick="return confirm('Do U Want To Delete')" href="delete_employee?eno=${emp.empno}">DeleteEmployee</a></td>
                       
                       
                   
                     </tr>
                </c:forEach>
       </table>
   </c:when>
   <c:otherwise>
           <h1 style="color:red;text-align:center"> Records  not  found </h1>
   </c:otherwise>
</c:choose>
                     <blink><h1 style="color:green;text-align:center">${resultMsg}</h1> </blink>
<br>
<tr>
<th><a href="add" ><h1 style="color: red;text-align: center;">Add Employee Details</h1></a></th>
<th><a href="./" ><h1 style="color: red;text-align: center;">Home</h1></a></th>


</tr>


                  