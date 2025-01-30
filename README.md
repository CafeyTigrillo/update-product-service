# Update Product Service

## 🚀 Overview

The **Update Product Service** is a simple RESTful API designed to update the details of a specific product in the database using its unique identifier (`id_product`). Built with **Spring Boot** and integrated with **JPA**, this service allows easy modification of product information.

This API is ideal for systems that need to update product details like price, name, description, or availability, such as e-commerce platforms or inventory management systems.

## 🌟 Key Features

- **RESTful API**: Exposes an endpoint to update a product by its ID.
- **JPA Integration**: Uses Java Persistence API to interact with the database.
- **Product Information Update**: Modify product details including name, description, price, category, and availability.

## 🔑 API Endpoint

- **PUT** `/edit/{id_product}`:  
  Updates the details of the product with the given ID.

  **Request Body**:
  - `name`: The name of the product.
  - `description`: A description of the product.
  - `price`: The price of the product.
  - `id_category`: The category ID the product belongs to.
  - `availability`: A boolean indicating if the product is available.

  **Response**:
  The API returns a `204 No Content` status when the product is successfully updated.

  **Error Handling**:
  If the product with the given ID is not found, the service may return a `404 Not Found` error.

## 🔧 Technologies Used

- **Spring Boot**: Framework used to build the application.
- **JPA** (Java Persistence API): Handles interactions with the database for updating products.
- **H2 Database** (or any relational database): Stores product data.
- **Java**: The programming language used to develop the service.

## 💡 Use Case

This service is useful for applications that require updating product information. It’s ideal for e-commerce platforms, inventory management systems, and other applications where product data needs to be modified.

---

This `README.md` describes the service, its endpoint, and how it can be used, all in a clear and appealing format. Let me know if you need anything else!
