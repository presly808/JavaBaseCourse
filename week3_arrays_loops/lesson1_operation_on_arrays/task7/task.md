### Description
We are going to implement method that calculate total price and return receipt based on bought products.

### Input Data:

`String[] products, int[] quantities, int[] prices, int[] discounts, boolean hasPremiumCard`

Let's add more clarity to input data:
* `products` array contain product names
* `quantities` array contain number to be bought per product
* `prices` array contain price per product
* `discounts` array contain discount per product
* if we have a `hasPremiumCard`, there is an additional discount 10%

### Expected
We should take products and its prices with possible discounts and calculate total price. 

Consider premiumCard which gives 10% of discount.

Please be aware that discounts array contains integer values.

### Validation
* Input Arrays should have size less or equal 4
* Arrays should not be empty
* Arrays should be the same size

In order to have a better visual representation we can relate to table view. Also take it as input and expected data.

| **products**                       | **quantities**  | **prices**       | **discounts**   | **hasPremiumCard** | **Expected**                            |
|------------------------------------|-----------------|------------------|-----------------|--------------------|-----------------------------------------|
| [Milk, Bread, Eggs]                | [1, 2, 3]       | [30, 10, 20]     | [0, 0, 0]       | false              | Final prices with discount is 110.0     |
| [Milk, Bread, Eggs]                | [1, 1, 1]       | [10, 10, 10]     | [10, 10, 10]    | false              | Final prices with discount is 27.0      |
| [Milk, Bread, Eggs]                | [1, 1, 1]       | [5, 5, 10]       | [0, 0, 0]       | true               | Final prices with discount is 18.0      |
| [Milk, Bread, Eggs, Beer, Oranges] | [1, 2, 3]       | [30, 10, 20]     | [0, 0, 0]       | false              | Input Data Arrays are not the same size |
| [Milk, Bread, Eggs, Beer, Oranges] | [1, 2, 3, 8, 7] | [1, 2, 3, 8, 7]  | [0, 0, 0, 0, 0] | false              | Input Arrays has size more than 4       |