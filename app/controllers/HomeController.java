package controllers;
import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        return ok("Welcome to the Home page");
    }
    public Result home() {
        return ok(home.render());
    }

    public Result equipment() {
        return ok(equipment.render());
    }

    public Result products() {
        return ok(products.render());
    }
    public Result jerseys() {
        return ok(jerseys.render());
    }
    public Result mens() {
        return ok(mens.render());
    }
    public Result womens() {
        return ok(womens.render());
    }

}


