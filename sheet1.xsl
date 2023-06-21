<xsl:stylesheet version='3.0' xmlns:xsl='http://www.w3.org/1999/XSL/Transform'>

    <xsl:output method="xml" omit-xml-declaration="no" use-character-maps="mdash amp" />

    <xsl:character-map name="mdash">
        <xsl:output-character character="&#x2014;" string="&amp;mdash;" />
    </xsl:character-map>

    <xsl:character-map name="amp">
        <xsl:output-character character="&amp;" string="&amp;" />
    </xsl:character-map>

    <xsl:mode on-no-match="shallow-copy"/>

</xsl:stylesheet>