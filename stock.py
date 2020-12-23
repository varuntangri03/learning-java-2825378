library(knitr)
function_name <- "TIME_SERIES_INTRADAY"
stock_ticker <- "NSEI"
period <- "1min"
my_api_key <- "2K3LR6Oxxxxxxxxx"
my_data_type <- "csv"
api_call <- paste0("https://www.alphavantage.co/query?function=", 
                   function_name, 
                   "&symbol=", 
                   stock_ticker, 
                   "&interval=", 
                   period, 
                   "&apikey=", 
                   my_api_key, 
                   "&datatype=", 
                   my_data_type)

df <- read.csv(url(api_call))
knitr::kable(head(df))


