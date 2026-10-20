<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output method="xml" indent="yes"/>

<xsl:template match="/">
    <agenda_contactos>
        <xsl:apply-templates select="agenda/contactos/persona"/>
    </agenda_contactos>
</xsl:template>

<xsl:template match="persona">
    <persona>
        <nombre>
            <xsl:value-of select="identificadores/nombre"/>
        </nombre>

        <apellidos>
            <xsl:value-of select="identificadores/apellidos"/>
        </apellidos>

        <telefonos>
            <xsl:copy-of select="telefonos/*"/>
        </telefonos>

        <direccion>
            <xsl:value-of select="concat(direccion/calle, ', ', direccion/localidad, ', ', direccion/cp)"/>
        </direccion>
    </persona>
</xsl:template>

</xsl:stylesheet>
