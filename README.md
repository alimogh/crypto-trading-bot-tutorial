## How to develop your own crypto trading bot
*This guide will make you build a trading bot from scratch. A trading bot is a computer program that can automatically place orders to a market or exchange without the need for human intervention. Bots, automated trading strategies, are the future of investing, they are working for you 24/7 and never lose their focus.*

## Introduction to Bitcoin & Cryptocurrency Trading

### What is Trading ?
Trading simply means “exchanging one item for another”. In the financial markets, it’s actually buying shares, futures, options, swaps, bonds etc… or like in our case, an amount of cryptocurrency.

The idea here is to buy cryptocurrency at a certain price and sell it at a higher price to make profits (even if you can still make a profit if the price goes down).

### What is an exchange ?
There are more than 1000 exchanges where you can buy and sell cryptocurrencies today. 

Most exchanges offer API for trading like the coinbase API. Thanks to this, instead of spending hours trading in front of your computer, you can write a program that trades for your. That’s the goal of this tutorial.
                                                                                      
One last point, some exchanges offer sandbox which allows you to trade on the “simulated platform” with fake assets. In this tutorial, we will use kucoin.

### What is a ticker ?
A ticker, synonym for stock symbol, is the short form of full security (asset) name (e.g. full: Bitcoin, ticker: BTC). A ticker has a stream of quotes (AKA prices) attached to it, continuously updated throughout a trading session by the various exchanges.

A description of the fields you can usually found in a ticker is [here](https://trading-bot.cassandre.tech/trading_basics_what_is_a_ticker.html) 

You can get the ticker of ETH-BTC by calling this address : [https://api.kucoin.com/api/v1/market/orderbook/level1?symbol=ETH-BTC](https://api.kucoin.com/api/v1/market/orderbook/level1?symbol=ETH-BTC).

If you have installed [wget](https://www.gnu.org/software/wget/) and [jq](https://stedolan.github.io/jq/) : `wget -q -O - https://api.kucoin.com/api/v1/market/orderbook/level1?symbol=ETH-BTC | jq`

The result is : 
```xml
{
  "code": "200000",
  "data": {
    "sequence": "1583442609331",
    "bestAsk": "0.024988",
    "size": "0.0282784",
    "price": "0.024987",
    "bestBidSize": "3.3342007",
    "time": 1591196236012,
    "bestBid": "0.024987",
    "bestAskSize": "8.5069518"
  }
}
```

## Technical analysis
### Introduction
### How does it look like ?
### Indicators

## Create your bot
### Development tools
### Create a Kucoin account
### Create your bot

## Create your strategy
### Add time series
### Add indicators
### Build a trading strategy

## Test your strategy
### Backtesting
### Forward Testing
### Live Testing

## Deploy
### Release management
### Release as a docker image
### Release deployment