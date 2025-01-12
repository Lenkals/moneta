"# moneta" 
curl -X POST http://localhost:8080/api/money/transfer \
     -H "Content-Type: application/json" \
     -d '{
           "amount": 1000.00,
           "currency": "USD",
           "targetCurrency": "EUR",
           "fee": {
             "number": 10.00,
             "currency": "USD"
           }
         }'
