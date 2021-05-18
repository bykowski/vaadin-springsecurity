package pl.bykowski.vaadinspringsecurity;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("mainPage")
public class MainPage extends AppLayout {

    @Autowired
    public MainPage() {
        Image img = new Image("https://www.akademiaspring.pl/assets/img/ksiazka-spring.jpg", "");
        img.setHeight("44px");
        setContent(img);
    }
}