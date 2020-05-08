
This is an example Servlet Filter, tested on Liferay DXP 7.2 fix pack 5,  on the 8th of May 2020.

NOTES:
It is very important to add this line to liferay-hook.xml:
    <before-filter>SSO Open SSO Filter</before-filter>
Otherwise there will be ClassNotFoundException in the console log.


I have not tested this myself but we can print a list of the filters, so we can decide where to put our own filter:
(During startup, in the InvokeFilterHelper during the registerFilterMapping):

_filterNames CopyOnWriteArrayList<E> (id=187)
    array Object[58] (id=201)
[0] "Ignore Filter - FTL" (id=206)\n
[1] "Ignore Filter - JSPF" (id=210)\n
[2] "Ignore Filter - VM" (id=211)\n
[3] "Valid Host Name Filter" (id=\n212)\n
[4] "Thread Dump Filter" (id=213)\n
[5] "Thread Local Filter" (id=214\n)\n
[6] "UnsyncPrintWriter Pool Filte\nr" (id=215)\n
[7] "URL Rewrite Filter" (id=216)\n
[8] "Compound Session Id Filter" \n(id=217)\n
[9] "Session Id Filter" (id=218)\n
[10] "Session Max Allowed Filter\n" (id=219)\n
[11] "Audit Filter" (id=220)\n
[12] "Absolute Redirects Fil\nter" (id=221)\n
[13] "Monitoring Filter" (id\n=222)\n
[14] "Virtual Host Filter" (\nid=22\n3)\n
[15] "Sharepoint Filter" (id\n=224)\n
[16] "SSO CAS Filter" (id=22\n5)\n
[17] "SSO Open SSO Filter" (\nid\n=226)\n
[18] "Auto Login Filter" (id\n=2\n27)\n
[19] "Header Filter" (id=228\n)\n
[20] "Header Filter - JSP" (\ni\nd=229)\n
[21] "Header Filter - No Cac\nh\ne" (id=230)\n
[22] "JSON Content Type Filt\ne\nr" (id=231)\n
[23] "ETag Filter" (id=232)\n
[24] "ETag Filter - JSP" (i\nd=233)\n
[25] "Cache Filter - Friend\nly" (id=234)\n
[26] "Cache Filter - Layout\n" (id=235)\n
[27] "Cache Filter - Resour\nce" (id=23\n6)\n
[28] "Cache Filter - Resour\nce JSP" (i\nd=237)\n
[29] "I18n Filter" (id=238)\n
[30] "Secure Friendly URL S\nervlet Filter" (id=239)\n
[31] "Secure Main Servlet F\nilter" (id=240)\n
[32] "Secure RSS Filter" (i\nd=241)\n
[33] "GZip Filter" (id=242)\n
[34] "GZip Filter - Theme P\nNG" (id=243)\n
[35] "Theme Preview Filter"\n (id=244)\n
[36] "Strip Filter" (id=245\n)\n
[37] "Language Filter" (id=\n2\n47)\n
[38] "Language Filter - JSP\n"\n (id=248)\n
[39] "Aggregate Filter" (id\n=\n249)\n
[40] "Aggregate Filter - JSP" (id=251)\n
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
