
This is an example Servlet Filter, tested on Liferay DXP 7.2 fix pack 5,  on the 8th of May 2020.

NOTES:
It is very important to add this line to liferay-hook.xml:
    <before-filter>SSO Open SSO Filter</before-filter>
Otherwise there will be ClassNotFoundException in the console log.


I have not tested this myself but we can print a list of the filters, so we can decide where to put our own filter:
(During startup, in the InvokeFilterHelper during the registerFilterMapping):

_filterNames CopyOnWriteArrayList<E> (id=187)
    array Object[58] (id=201)
[0] "Ignore Filter - FTL" (id=206)<br>
[1] "Ignore Filter - JSPF" (id=210)<br>
[2] "Ignore Filter - VM" (id=211)<br>
[3] "Valid Host Name Filter" (id=<br>212)<br>
[4] "Thread Dump Filter" (id=213)<br>
[5] "Thread Local Filter" (id=214<br>)<br>
[6] "UnsyncPrintWriter Pool Filte<br>r" (id=215)<br>
[7] "URL Rewrite Filter" (id=216)<br>
[8] "Compound Session Id Filter" <br>(id=217)<br>
[9] "Session Id Filter" (id=218)<br>
[10] "Session Max Allowed Filter<br>" (id=219)<br>
[11] "Audit Filter" (id=220)<br>
[12] "Absolute Redirects Fil<br>ter" (id=221)<br>
[13] "Monitoring Filter" (id<br>=222)<br>
[14] "Virtual Host Filter" (<br>id=22<br>3)<br>
[15] "Sharepoint Filter" (id<br>=224)<br>
[16] "SSO CAS Filter" (id=22<br>5)<br>
[17] "SSO Open SSO Filter" (<br>id<br>=226)<br>
[18] "Auto Login Filter" (id<br>=2<br>27)<br>
[19] "Header Filter" (id=228<br>)<br>
[20] "Header Filter - JSP" (<br>i<br>d=229)<br>
[21] "Header Filter - No Cac<br>h<br>e" (id=230)<br>
[22] "JSON Content Type Filt<br>e<br>r" (id=231)<br>
[23] "ETag Filter" (id=232)<br>
[24] "ETag Filter - JSP" (i<br>d=233)<br>
[25] "Cache Filter - Friend<br>ly" (id=234)<br>
[26] "Cache Filter - Layout<br>" (id=235)<br>
[27] "Cache Filter - Resour<br>ce" (id=23<br>6)<br>
[28] "Cache Filter - Resour<br>ce JSP" (i<br>d=237)<br>
[29] "I18n Filter" (id=238)<br>
[30] "Secure Friendly URL S<br>ervlet Filter" (id=239)<br>
[31] "Secure Main Servlet F<br>ilter" (id=240)<br>
[32] "Secure RSS Filter" (i<br>d=241)<br>
[33] "GZip Filter" (id=242)<br>
[34] "GZip Filter - Theme P<br>NG" (id=243)<br>
[35] "Theme Preview Filter"<br> (id=244)<br>
[36] "Strip Filter" (id=245<br>)<br>
[37] "Language Filter" (id=<br>2<br>47)<br>
[38] "Language Filter - JSP<br>"<br> (id=248)<br>
[39] "Aggregate Filter" (id<br>=<br>249)<br>
[40] "Aggregate Filter - JSP" (id=251)<br>
[41] "Dynamic CSS Filter" (id=252)
[42] "Dynamic CSS Filter - JSP" (id=254)
[43] "Servlet Context Include Filter" (id=255)
[44] "Atom Servlet Filter" (id=256)
[45] "Axis Servlet Filter" (id=258)
[46] "JSON Servlet Filter" (id=259)
[47] "JSON Web Service Servlet Filter" (id=262)
[48] "Remoting Servlet Filter" (id=263)
[49] "Tunnel Servlet Filter" (id=264)
[50] "WebDAV Servlet Filter" (id=265)
[51] "XML-RPC Servlet Filter" (id=266)
[52] "WebLogic Include Filter" (id=267)
[53] "Upload Servlet Request Filter" (id=268)
[54] "IE MimeType Compatibility Filter" (id=269)
[55] "Init Filter" (id=270)
[56] "Sync Auth Filter" (id=271)
[57] "SPA Filter" (id=272)
