import axios from "axios";

class ProductService {
  getProducts() {
    return axios.get("http://localhost:8090/users");
  }
}
export default ProductService;
