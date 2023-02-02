The following task helps you to learn how to use `indexOf`, `lastIndexOf`, `substring`

### Description
Extract string that is surrounded by brackets (`{` and `}`)

### Validations
Please, return `input` argument if:
* input is `null` OR input length is `0`
* indexes of brackets were not found

### Example Input Data and Expected Result

| input argument | returned value |
|----------------|----------------|
| "{value}"      | "value"        |
| "cccc"         | "cccc"         |
| null           | null           |
| "cccc}"        | "cccc}"        |
| "{cccc"        | "{cccc"        |
| "{}"           | ""             |