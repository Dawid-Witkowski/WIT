<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" encoding="UTF-8"/>

  <xsl:template match="/">
    <html>
      <head>
        <title>Lista Osób</title>
        
        <style>
          h1 {color: darkblue;}
          .female {background-color: pink;}
          .male {background-color: lightblue;}
          .other {background-color: yellow;}
          .invalid {color: red;}
        </style>
      </head>
      <body>
        <p><strong>Source:</strong> <xsl:value-of select="root/@source" /></p> 
        <p><strong>Modify Data:</strong> <xsl:value-of select="root/info/@modify_data" /></p>
        <h1>Lista Osób</h1>
        <table border="1">
          <tr>
            <th>Imię</th>
            <th>Wiek</th>
            <th>Email</th>
            <th>Telefon</th>
            <th>Hobby</th>
          </tr>
          <xsl:for-each select="root/people/person">
            <xsl:variable name="class">
              <xsl:choose>
                <xsl:when test="@plec='female'">female</xsl:when>
                <xsl:when test="@plec='male'">male</xsl:when>
                <xsl:otherwise>other</xsl:otherwise>
              </xsl:choose>
            </xsl:variable>
            <tr>
              <xsl:attribute name="class">
                <xsl:value-of select="$class"/>
              </xsl:attribute>
              <td><xsl:value-of select="name"/></td>
              <td><xsl:value-of select="age"/></td>
              <td>
                <xsl:choose>
                  <xsl:when test="not(matches(mail, '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}'))">
                    <span class="invalid"><xsl:value-of select="mail"/></span>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:value-of select="mail"/>
                  </xsl:otherwise>
                </xsl:choose>
              </td>
              <td>
                <xsl:choose>
                  <xsl:when test="not(matches(telefon, '\+48\d{9}'))">
                    <span class="invalid"><xsl:value-of select="telefon"/></span>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:value-of select="telefon"/>
                  </xsl:otherwise>
                </xsl:choose>
              </td>
              <td><xsl:value-of select="hobby"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
