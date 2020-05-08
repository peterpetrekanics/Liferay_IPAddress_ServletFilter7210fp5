
This is an example Servlet Filter, tested on Liferay DXP 7.2 fix pack 5,  on the 8th of May 2020.
<br>
<br>
NOTES:<br>
<br>
It is very important to add this line to liferay-hook.xml:
    <before-filter>SSO Open SSO Filter</before-filter>
Otherwise there will be ClassNotFoundException in the console log.

<br>
I have not tested this myself but we can print a list of the filters, so we can decide where to put our own filter:
(During startup, in the InvokeFilterHelper during the registerFilterMapping):
<br>
<br>
_filterNames CopyOnWriteArrayList<E> (id=187)<br>
    array Object[58] (id=201)<br>
[0] "Ignore Filter - FTL" (id=206)<br>
[1] "Ignore Filter - JSPF" (id=210)<br>
[2] "Ignore Filter - VM" (id=211)<br>
[3] "Valid Host Name Filter" (id=212)<br>
[4] "Thread Dump Filter" (id=213)<br>
[5] "Thread Local Filter" (id=214)<br>
[6] "UnsyncPrintWriter Pool Filter" (id=215)<br>
[7] "URL Rewrite Filter" (id=216)<br>
[8] "Compound Session Id Filter" (id=217)<br>
[9] "Session Id Filter" (id=218)<br>
[10] "Session Max Allowed Filter" (id=219)<br>
[11] "Audit Filter" (id=220)<br>
[12] "Absolute Redirects Filter" (id=221)<br>
[13] "Monitoring Filter" (id=222)<br>
[14] "Virtual Host Filter" (id=223)<br>
[15] "Sharepoint Filter" (id=224)<br>
[16] "SSO CAS Filter" (id=225)<br>
[17] "SSO Open SSO Filter" (id=226)<br>
[18] "Auto Login Filter" (id=227)<br>
[19] "Header Filter" (id=228)<br>
[20] "Header Filter - JSP" (id=229)<br>
[21] "Header Filter - No Cache" (id=230)<br>
[22] "JSON Content Type Filter" (id=231)<br>
[23] "ETag Filter" (id=232)<br>
[24] "ETag Filter - JSP" (id=233)<br>
[25] "Cache Filter - Friendly" (id=234)<br>
[26] "Cache Filter - Layout" (id=235)<br>
[27] "Cache Filter - Resource" (id=236)<br>
[28] "Cache Filter - Resource JSP" (id=237)<br>
[29] "I18n Filter" (id=238)<br>
[30] "Secure Friendly URL Servlet Filter" (id=239)<br>
[31] "Secure Main Servlet Filter" (id=240)<br>
[32] "Secure RSS Filter" (id=241)<br>
[33] "GZip Filter" (id=242)<br>
[34] "GZip Filter - Theme PNG" (id=243)<br>
[35] "Theme Preview Filter" (id=244)<br>
[36] "Strip Filter" (id=245)<br>
[37] "Language Filter" (id=247)<br>
[38] "Language Filter - JSP" (id=248)<br>
[39] "Aggregate Filter" (id=249)<br>
[40] "Aggregate Filter - JSP" (id=251)<br>
[41] "Dynamic CSS Filter" (id=252)<br>
[42] "Dynamic CSS Filter - JSP" (id=254)<br>
[43] "Servlet Context Include Filter" (id=255)<br>
[44] "Atom Servlet Filter" (id=256)<br>
[45] "Axis Servlet Filter" (id=258)<br>
[46] "JSON Servlet Filter" (id=259)<br>
[47] "JSON Web Service Servlet Filter" (id=262)<br>
[48] "Remoting Servlet Filter" (id=263)<br>
[49] "Tunnel Servlet Filter" (id=264)<br>
[50] "WebDAV Servlet Filter" (id=265)<br>
[51] "XML-RPC Servlet Filter" (id=266)<br>
[52] "WebLogic Include Filter" (id=267)<br>
[53] "Upload Servlet Request Filter" (id=268)<br>
[54] "IE MimeType Compatibility Filter" (id=269)<br>
[55] "Init Filter" (id=270)<br>
[56] "Sync Auth Filter" (id=271)<br>
[57] "SPA Filter" (id=272)<br>
