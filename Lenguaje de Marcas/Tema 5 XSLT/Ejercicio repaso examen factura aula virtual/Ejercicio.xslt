<?xml version="1.0" encoding="UTF-8"?>
<!--
  ESTE ARCHIVO ES EL XSLT (LA “PLANTILLA”).
  Su trabajo es: coger el XML y convertirlo en HTML bonito.
-->

<xsl:stylesheet version="1.0"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <!-- Esto dice que vamos a generar HTML -->
  <xsl:output method="html" encoding="UTF-8" indent="yes"/>
  <!-- Plantilla principal: se aplica al documento entero -->
  <xsl:template match="/">
    <html>
      <head>
        <meta charset="UTF-8"/>
        <title>Factura <xsl:value-of select="factura/@numero"/></title>
     <!-- Un poco de CSS para que se vea bien -->
        <style>
          body{font-family: Arial, sans-serif; margin:20px;}
          .box{border:1px solid #333; padding:12px; margin-bottom:12px;}
          .grid{display:flex; gap:12px;}
          .col{flex:1;}
          h1,h2{margin:0 0 10px 0;}
          table{border-collapse:collapse; width:100%;}
          th,td{border:1px solid #333; padding:8px; vertical-align:top;}
          th{background:#f2f2f2;}
          .right{text-align:right;}
          .totales td{border:none;}
          .totales .label{text-align:right; font-weight:bold;}
          .totales .value{text-align:right;}
        </style>
      </head>

      <body>
        <h1>FACTURA nº <xsl:value-of select="factura/@numero"/></h1>

        <div class="grid">
          <div class="box col">
            <h2>Empresa</h2>
            <div><b><xsl:value-of select="factura/empresa/nombre"/></b></div>
            <div><xsl:value-of select="factura/empresa/direccion"/></div>
            <div>
              <xsl:value-of select="factura/empresa/ciudad"/> -
              <xsl:value-of select="factura/empresa/cp"/>
            </div>
            <div>C.I.F.: <xsl:value-of select="factura/empresa/cif"/></div>
            <div>Tel: <xsl:value-of select="factura/empresa/telefono"/></div>
            <div>Fax: <xsl:value-of select="factura/empresa/fax"/></div>
          </div>

          <div class="box col">
            <h2>Datos Factura</h2>
            <div>Fecha: <xsl:value-of select="factura/cabecera/fecha"/></div>
            <div>Pedido nº <xsl:value-of select="factura/cabecera/pedido"/></div>
            <div>Forma de pago: <xsl:value-of select="factura/cabecera/forma_pago"/></div>
          </div>
        </div>
    <!-- Bloque Cliente -->
        <div class="box">
          <h2>Datos Cliente</h2>
          <div>nº cliente: <xsl:value-of select="factura/cliente/@numero"/></div>
          <div>Nombre: <xsl:value-of select="factura/cliente/nombre"/></div>
          <div>Dirección de envío: <xsl:value-of select="factura/cliente/direccion_envio"/></div>
          <div>Población: <xsl:value-of select="factura/cliente/poblacion"/></div>
          <div>CP: <xsl:value-of select="factura/cliente/cp"/></div>
          <div>Provincia: <xsl:value-of select="factura/cliente/provincia"/></div>
        </div>
      <!-- Tabla de líneas -->
        <div class="box">
          <h2>Detalle</h2>
          <table>
            <thead>
              <tr>
                <th>REF.</th>
                <th>DESCRIPCIÓN</th>
                <th class="right">CANT.</th>
                <th class="right">PRECIO</th>
                <th class="right">I.G.V.</th>
                <th class="right">IMPORTE</th>
              </tr>
            </thead>
                <!-- Recorremos cada línea del XML -->
            <tbody>
              <xsl:for-each select="factura/lineas/linea">
                <tr>
                  <td><xsl:value-of select="ref"/></td>
                  <td><xsl:value-of select="descripcion"/></td>
                  <td class="right"><xsl:value-of select="cantidad"/></td>
                  
                <!-- Formateo con 2 decimales y cambiando "." por "," -->
                  <td class="right">
                    <xsl:value-of select="translate(format-number(number(precio),'0.00'),'.',',')"/> eur.
                  </td>
                  <td class="right">
                    <xsl:value-of select="translate(format-number(number(igv),'0.0'),'.',',')"/>
                  </td>
                  <td class="right">
                    <xsl:value-of select="translate(format-number(number(importe),'0.00'),'.',',')"/> eur.
                  </td>
                </tr>
              </xsl:for-each>
            </tbody>
          </table>
        </div>

        <div class="box">
          <h2>Totales</h2>
          <table class="totales">
            <tr>
              <td class="label">Base imponible:</td>
              <td class="value">
                <xsl:value-of select="translate(format-number(number(factura/totales/base_imponible),'0.00'),'.',',')"/> eur.
              </td>
            </tr>
            <tr>
              <td class="label">% I.G.V.:</td>
              <td class="value">
                <xsl:value-of select="translate(format-number(number(factura/totales/igv_porcentaje),'0.0'),'.',',')"/>
              </td>
            </tr>
            <tr>
              <td class="label">Cuota I.G.V.:</td>
              <td class="value">
                <xsl:value-of select="translate(format-number(number(factura/totales/cuota_igv),'0.00'),'.',',')"/> eur.
              </td>
            </tr>
            <tr>
              <td class="label" style="font-size:18px;">TOTAL FACTURA:</td>
              <td class="value" style="font-size:18px; font-weight:bold;">
                <xsl:value-of select="translate(format-number(number(factura/totales/total_factura),'0.00'),'.',',')"/> eur
              </td>
            </tr>
          </table>
        </div>

      </body>
    </html>
  </xsl:template>

</xsl:stylesheet>