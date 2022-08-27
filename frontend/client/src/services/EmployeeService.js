import axios from "axios";

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/v1/employees"

class EmployeeService {
    saveEmployee(employee){
        console.log(employee);
        return axios.post(EMPLOYEE_API_BASE_URL, employee);
    }

    getEmployees(){
        var result = axios.get(EMPLOYEE_API_BASE_URL);
        console.log(result.data);
        return result
    }

    deleteEmployee(id) {
        return axios.delete(EMPLOYEE_API_BASE_URL + "/" + id);
    }
}


export default new EmployeeService();