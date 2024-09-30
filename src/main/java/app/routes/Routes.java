package app.routes;

import io.javalin.apibuilder.EndpointGroup;

import static io.javalin.apibuilder.ApiBuilder.path;

public class Routes {

    private final HotelRoute hotelRoute = new HotelRoute();
    private final RoomRoute roomRoute = new RoomRoute();

    public EndpointGroup getApiRoutes() {
        return () -> {
            path("/", hotelRoute.getHotelRoutes());
            path("/", roomRoute.getRoomRoutes());
        };
    }

}
