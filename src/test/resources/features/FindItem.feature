Feature: Find the specified item

  Background:
    Given the user is on the etsy homepage
    When the user searches for "apple watch band"

  @wip
  Scenario Outline: Find the "<Product Identifier>" item
    When the user clicks on the "<Product Identifier>" item
    Then the seller title should be "<Seller Title>"
    Examples:
      | Product Identifier        | Seller Title    |
      | Black Stitching           | TexansWatchband |
      | Personalized Leather Gift | TexansWatchband |