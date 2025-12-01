package com.example.sori_records;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.sori_records.model.Album;
import com.example.sori_records.model.Usuario;
import com.example.sori_records.repository.AlbumRepository;
import com.example.sori_records.repository.UsuarioRepository;

@Component
public class DatabaseStartup {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AlbumRepository albumRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void populateDatabase() {
        System.out.println("Agregando detalles");


        // Users
        usuarioRepository.save(new Usuario("Nombre1", "Contraseña1", "Email1", "Direccion1"));
        usuarioRepository.save(new Usuario("Nombre2", "Contraseña2", "Email2", "Direccion2"));
        usuarioRepository.save(new Usuario("Nombre3", "Contraseña3", "Email3", "Direccion3"));
        usuarioRepository.save(new Usuario("Nombre4", "Contraseña4", "Email4", "Direccion4"));

        //Albumes
         albumRepository.save(new Album("Man's Best Friend D2C Alt Cover Cassette", "Sabrina Carpenter",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/sab_mbf_cassette.png",
    24990, "Man's Best Friend is the latest album from multi-hyphenate global popstar Sabrina Carpenter", "Cassette"));

albumRepository.save(new Album("Man's Best Friend D2C Luxe Packaging LP", "Sabrina Carpenter",
"https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/sab_mbf_vinyl.png",
    56990, "Man's Best Friend is the latest album from multi-hyphenate global popstar Sabrina Carpenter.", "Vinilo"));

albumRepository.save(new Album("Short n' Sweet Alternate Cover CD", "Sabrina Carpenter",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/sab_ss_cd.png",
    14990, "Short n’ Sweet showcases the scintillating spirit of Sabrina Carpenter, the pocket-sized popstar with a larger than life artistic presence.", "CD"));

albumRepository.save(new Album("Rising", "Mxmtoon",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/mxmtoon_rising_casette.png",
    15990, "mxmtoon's second full-length, rising. Clear cassette\nRelease Date: May 20, 2022\nRecord Label: AWAL Recordings America, Inc.\nFormat + Color: Cassette\n", "Cassette"));

albumRepository.save(new Album("liminal space", "Mxmtoon",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/mxmtoon_ls_vinyl.png",
    22990, "exclusive cloudy green vinyl", "Vinilo"));

albumRepository.save(new Album("The Crux Deluxe Cassette", "DJO",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/djo_thec_cassette.png",
    19990, "Please note, this physical release contains twelve tracks comprising The Crux Deluxe. It does not include the twelve tracks from the original The Crux release.", "Cassette"));

albumRepository.save(new Album("The Crux CD", "DJO",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/djo_thec_cd.png",
    13990, "Title: The Crux\nArtist: Djo\nFormat: CD\nRelease Date: May 30, 2025\n", "CD"));

albumRepository.save(new Album("The Crux Deluxe 12\" Vinyl (Black)", "DJO",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/djo_thecd_vinilo.png",
    27990, "Title: The Crux Deluxe\nArtist: Djo\nFormat: 12\" Vinyl (Black)\nRelease Date: September 12, 2025\n", "Vinilo"));

albumRepository.save(new Album("DECIDE 12\" Vinyl (Black)", "Djo",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/djo_decide_vinyl.png",
    27990, "Title: Decide\nArtist: Djo\nFormat: 12\" Vinyl (Black)\nRelease Date: September 16, 2022\n", "Vinilo"));

albumRepository.save(new Album("YEONJUN 'NO LABELS: PART 01' (Trunk Shorts Ver.)", "YEONJUN",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/yeonjun_nolabel_cd.png",
    29990, "YEONJUN of TOMORROW X TOGETHER (TXT) releases their first mini album 'NO LABELS: PART 01' – a snapshot of YEONJUN that has never been seen before by MOA. Contents: CD, Trunk Shorts, Photocard (4ea). Dimensions: 190 x 190 x 40 mm.", "CD"));

albumRepository.save(new Album("Chaos Angel Cassette", "Maya Hawke",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/maya_ca_cassatte.png",
    16990, "Chaos Angel, the full-length album by Maya Hawke.\nRelease Date: May 31, 2024\nFormat + Color: White Cassette\n", "Cassette"));

albumRepository.save(new Album("BEAUTIFUL CHAOS - Standard Vinyl", "KATSEYE",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/katseye_bc_vinyl.png",
    31990, "KATSEYE's 2nd EP, BEAUTIFUL CHAOS, via HYBE x Geffen Records, embraces the key message of \"celebrating confusion.\"", "Vinilo"));

albumRepository.save(new Album("TXT BEOMGYU - BEOMGYU'S MIXTAPE : PANIC", "BEOMGYU",
    "https://raw.githubusercontent.com/CristobalKri/Sori_Records-grupo-01-tk/master/app/src/main/res/drawable/beomgyu_panic_cd.png",
    44990, "BEOMGYU - BEOMGYU’s Mixtape: Panic\nDETALLES:\n- Out Box : 170x140X95mm\n- View Master : W130xH97xT75mm\n", "CD"));



    }
}
