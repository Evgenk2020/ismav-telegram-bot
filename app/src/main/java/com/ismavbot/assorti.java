package com.ismavbot;

public class assorti {
    public static class preparations {
        public String name;
        public String key;
        public String short_info_file;
        public String price;
        public String info_file;
        public String image_ile;
    }

    public interface prep {
        public preparations get();
    }

    public static class rizogumun extends preparations implements prep {
        private String prep = assort_enum.rhizogumin.toString();

        rizogumun() {
            this.name = "Ризогумін";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class rizoloquid extends preparations implements prep {
        private String prep = assort_enum.rhizoliquid.toString();

        rizoloquid() {
            this.name = "Ризогумін рідкий";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class diazobacterin extends preparations implements prep {
        private String prep = assort_enum.diazobacterin.toString();

        diazobacterin() {
            this.name = "Діазобактерин (рідкий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class polimixobacterin extends preparations implements prep {
        private String prep = assort_enum.polimixobacterin.toString();

        polimixobacterin() {
            this.name = "Поліміксобактерин (рідкий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class albobacterin extends preparations implements prep {
        private String prep = assort_enum.albobacterin.toString();

        albobacterin() {
            this.name = "Альбобактерин (рідкий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class biogran extends preparations implements prep {
        private String prep = assort_enum.biogran.toString();

        biogran() {
            this.name = "Біогран (рідкий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class microgumin extends preparations implements prep {
        private String prep = assort_enum.microgumin.toString();

        microgumin() {
            this.name = "Мікрогумін";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class hetomik extends preparations implements prep {
        private String prep = assort_enum.hetomik.toString();

        hetomik() {
            this.name = "Хетомік (порошкоподібний сухий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class rhizobofit extends preparations implements prep {
        private String prep = assort_enum.rhizobofit.toString();

        rhizobofit() {
            this.name = "Ризобофіт (рідкий)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class antimishin extends preparations implements prep {
        private String prep = assort_enum.antimishin.toString();

        antimishin() {
            this.name = "Антимишин (засіб для дератизації)";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class sinazh extends preparations implements prep {
        private String prep = assort_enum.sinazh.toString();

        sinazh() {
            this.name = "Консервант для сінажу";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class zakvaska extends preparations implements prep {
        private String prep = assort_enum.zakvaska.toString();

        zakvaska() {
            this.name = "Закваска силосна";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class subtikon extends preparations implements prep {
        private String prep = assort_enum.subtikon.toString();

        subtikon() {
            this.name = "Субтікон";
            this.key = prep;
            this.short_info_file = ("short/" + prep + ".html");
            this.price = ("price/" + prep + ".html");
            this.info_file = ("info/" + prep + ".html");
            this.image_ile = ("images/" + prep + ".jpg");
        }

        @Override
        public preparations get() {
            return this;
        }
    }

    public static class units_factory {
        public prep _prep(assort_enum inf) {
            if (inf == assort_enum.rhizogumin) {
                return new rizogumun();
            }

            if (inf == assort_enum.rhizoliquid) {
                return new rizoloquid();
            }

            if (inf == assort_enum.diazobacterin) {
                return new diazobacterin();
            }

            if (inf == assort_enum.polimixobacterin) {
                return new polimixobacterin();
            }

            if (inf == assort_enum.albobacterin) {
                return new albobacterin();
            }

            if (inf == assort_enum.biogran) {
                return new biogran();
            }

            if (inf == assort_enum.microgumin) {
                return new microgumin();
            }

            if (inf == assort_enum.hetomik) {
                return new hetomik();
            }

            if (inf == assort_enum.rhizobofit) {
                return new rhizobofit();
            }

            if (inf == assort_enum.antimishin) {
                return new antimishin();
            }

            if (inf == assort_enum.sinazh) {
                return new sinazh();
            }

            if (inf == assort_enum.zakvaska) {
                return new zakvaska();
            }

            if (inf == assort_enum.subtikon) {
                return new subtikon();
            }

            return null;
        }
    }
}
