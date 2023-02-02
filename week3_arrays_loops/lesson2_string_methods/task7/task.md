The following task helps you to learn how to use `trim`, `split`

### Description
Removes whitespace from both ends of a string, then create String arrays by splitting it with `,` symbol

### Validations
Please, return empty string array `new String[0]` if:
* input is `null` OR input isEmpty

### Example Input Data and Expected Result

| input argument   | returned value      |
|------------------|---------------------|
| " First,Second " | {"First", "Second"} |
| ""               | {}                  |
| null             | {}                  |
| "One"            | {"One"}             |