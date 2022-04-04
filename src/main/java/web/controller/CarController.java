package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller
public class CarController {

    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

//   @GetMapping("/cars")
//    public String getCars(ModelMap model) {
//        model.addAttribute("message", carDao.getCars());
//        return "cars";
//    }

    @GetMapping("cars")
    public String getNumberOfCar(@RequestParam(value = "count", required = false) String count, ModelMap model) {
        if (count == null) {
            model.addAttribute("message", carDao.getCars());
        }
        else {
            model.addAttribute("message", carDao.getNumberOfCar(count));
        }
        return "cars";
    }
}
