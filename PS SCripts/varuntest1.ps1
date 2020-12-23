$function = "TIME_SERIES_INTRADAY"
$stockticker = "NSEI"
$period = "60min"
$apiKey = "TWLRGI3V39UODRXW"
$baseuri = "https://www.alphavantage.co/query?function="
$callUri = $baseuri + $function +"&symbol=$stockticker&interval=$period&outputsize=full&apikey=$apiKey"
$Query = Invoke-WebRequest -Uri $callUri -ContentType "application/json" -UseBasicParsing
$queryresult = $query.content | ConvertFrom-Json
$queryresult.'Time Series (60min)'
$queryresult.'Time Series (60min)'



$callUriCSV = $baseuri + $function +"&symbol=IBM&interval=$period&outputsize=full&apikey=$apiKey&datatype=csv"
$Query1 = Invoke-WebRequest -Uri $callUriCSV -ContentType "application/json" -UseBasicParsing
$query1result = $query1.content | ConvertFrom-Json


