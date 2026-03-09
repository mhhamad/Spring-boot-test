// Fetch products from backend API and display them
async function loadProducts() {
    const list = document.getElementById("product-list");
    list.innerHTML = "";

    try {
        // Fetch product names from backend
        const response = await fetch('http://localhost:8080/home');
        if (!response.ok) {
            throw new Error(`HTTP error! status: ${response.status}`);
        }

        // Assume backend returns ["Laptop", "Smartphone", "Tablet"]
        const productNames = await response.json();

        // Map to product objects with placeholder ids and prices
        const products = productNames.map((name, index) => ({
            id: index + 1,
            name: name,
            price: 100 * (index + 1) * 10 // placeholder price
        }));

        // Render products
        products.forEach(p => {
            const div = document.createElement("div");
            div.innerHTML = `
                <strong>${p.name}</strong> - $${p.price} 
                <button onclick="buyProduct(${p.id})">Buy</button>
            `;
            list.appendChild(div);
        });

    } catch (error) {
        list.innerHTML = `<p>Error loading products: ${error.message}</p>`;
        console.error(error);
    }
}

// Placeholder buy function
function buyProduct(id) {
    alert(`Buying product ${id} - call backend /cart/add/${id} later`);
}

window.onload = loadProducts;