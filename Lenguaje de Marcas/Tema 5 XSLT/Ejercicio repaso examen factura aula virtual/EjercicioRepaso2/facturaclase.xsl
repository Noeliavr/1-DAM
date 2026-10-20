<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                <img source="logo.png" alt="Este es el logo"></img>
                <h1>NUMERO DE LA FACTURA: <xsl:value-of select="factura/numerofactura"></xsl:value-of> </h1>
                <hr style="height: 3px; background-color: black; border: none;"></hr>
                <p>NOMBRE DEL CLIENTE: <xsl:value-of select="factura/datoscliente/Nombre"></xsl:value-of></p>
                <hr style="height: 3px; background-color: black; border: none;"></hr>
                <p>POBLACIÓN: <xsl:value-of select="factura/datoscliente/poblacion"></xsl:value-of></p>
                <table border="1">
                    <tr>
                        <th>REF</th>
                        <th>DESCRIPCIÓN</th>
                        <th>CANTIDAD</th>
                        <th>PRECIO</th>
                        <th>I.G.V</th>
                        <th>IMPORTE</th>
                    </tr>
                    <xsl:for-each select="factura/datosfactura/linea">
                    <tr>
                        <td><xsl:value-of select="ref"></xsl:value-of></td>
                        <td><xsl:value-of select="descripcion"></xsl:value-of></td>
                        <td><xsl:value-of select="cantidad"></xsl:value-of></td>
                        <td><xsl:value-of select="precio"></xsl:value-of></td>
                        <td><xsl:value-of select="IGV"></xsl:value-of></td>
                        <td><xsl:value-of select="importe"></xsl:value-of></td>
                    </tr>
                    </xsl:for-each>



                </table>



            </body>
        </html>








    </xsl:template>
</xsl:stylesheet>