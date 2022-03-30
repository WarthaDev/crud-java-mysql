# Host: localhost  (Version 5.5.5-10.1.36-MariaDB)
# Date: 2019-07-16 17:39:58
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "addbarang"
#

DROP TABLE IF EXISTS `addbarang`;
CREATE TABLE `addbarang` (
  `namabarang` varchar(255) NOT NULL DEFAULT '',
  `merk` varchar(255) NOT NULL DEFAULT '',
  `modelbarang` varchar(255) NOT NULL DEFAULT '',
  `tipe` varchar(255) NOT NULL DEFAULT '',
  `stok` varchar(255) NOT NULL DEFAULT '0',
  `harga` varchar(255) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "addbarang"
#

INSERT INTO `addbarang` VALUES ('Processor','AMD','AMD A10 7870K 3.9GHZ','FM2+','3','1525000'),('Processor','AMD','AMD A10 9700K 3.5GHZ 4CORE','Bristol','3','1200000'),('Processor','AMD','AMD A12 9800K 3.8GHZ 4CORE','Bristol','3','1455000'),('Processor','AMD','AMD A4 6300 3.7GHZ ','FM2+','4','465000'),('Processor','AMD','AMD A6 6400K','FM2+','4','560000'),('Processor','AMD','AMD A6 7400K 3.9GHZ','FM2+','2','600000'),('Processor','AMD','AMD A6 9500 3.5GHZ 2CORE','Brisol','3','710000'),('Processor','AMD','AMD A8 7600 3.8GHZ ','FM2+','3','935000'),('Processor','AMD','AMD A8 9600 3.1GHZ 4CORE','Bristol','3','780000'),('Processor','AMD','AMD ATHLON X4 840 3.1GHZ','FM2+','4','925000'),('Processor','AMD','AMD ATHLON X4 860 3.7GHZ ','FM2+','3','750000'),('Processor','AMD','AMD ATHLON X4 880 4.0GHZ','FM2+','3','1200000'),('Processor','AMD','AMD FX 4300 3.8GHZ','AM3+','3','1325000'),('Processor','AMD','AMD FX 6300 3.5GHZ','AM3+','2','1475000'),('Processor','AMD','AMD FX 8320E 3.5GHZ','AM3+','2','1900000'),('Processor','AMD','AMD FX 8350 4.0GHZ','AM3+','3','2700000'),('Processor','AMD','AMD FX 9370 4.4GHZ','AM3+','2','3100000'),('Processor','AMD','AMD RYZEN 3 1200 3.1HZ 4C/4T','AM4','3','1450000'),('Processor','AMD','AMD RYZEN 3 1300X 3.4HZ 4C/4T','AM4','3','1650000'),('Processor','AMD','AMD RYZEN 3 2200 G - 4C/8T','AM4','4','1500000'),('Processor','AMD','AMD RYZEN 5 1400 3.5HZ 4C/8T','AM4','3','2375000'),('Processor','AMD','AMD RYZEN 5 1500X 3.5HZ 4C/8T','AM4','3','2300000'),('Processor','AMD','AMD RYZEN 5 1600 3.2HZ 6C/12T ','AM4','3','2950000'),('Processor','AMD','AMD RYZEN 5 1600X 3.6HZ 6C/12T','AM4','4','3150000'),('Processor','AMD','AMD RYZEN 5 2400 G - 4C/4T','AM4','3','2450000'),('Processor','AMD','AMD RYZEN 5 2600 WITH WRAITH SPRIPE 95W 4.25MHZ 6C/12T','AM4','4','3450000'),('Processor','AMD','AMD RYZEN 5 2600 WITH WRAITH STEALTH 3.9MHZ 6C/12T','AM4','3','3050000'),('Processor','AMD','AMD RYZEN 7 1700 3.0GHZ 8C/16T','AM4','4','4475000'),('Processor','AMD','AMD RYZEN 7 1700X 3.4GHZ 8C/16T','AM4','4','4575000'),('Processor','AMD','AMD RYZEN 7 1800X 3.8GHZ 8C/16T','AM4','4','5200000'),('Processor','AMD','AMD RYZEN 7 2700 WITH PRIMS 4.3MHZ  8C/16T','AM4','4','5100000'),('Processor','AMD','AMD RYZEN 7 2700 WITH WRAITH SPRIPE (LED) 4.1MHZ  8C/16T','AM4','4','4650000'),('Processor','AMD','AMD RYZEN THREADRIPPER 1920X 12C/24T 3.5HZ','TR4','0','11850000'),('Processor','AMD','AMD RYZEN THREADRIPPER 1950X 12C/32T 3.5HZ','TR4','0','14900000'),('Processor','AMD','AMD A12 9800K 3.8GHZ 4CORE','Bristol','3','1455000'),('Motherboard','ASRock','ASRock 970 EXTREME 4','Socket AM3+','4','1270000'),('Motherboard','ASRock','ASRock 970 PRO 3 R2.0','Socket AM3+','2','1200000'),('Motherboard','Asus','Asus H170 PRO GAMING','LGA 1151','9','2750000'),('RAM','ADATA','ADATA XPG 8GB','(4X2) KIT 3000MHZ DDR4','9','1850000'),('RAM','Gskill','Gskill RIPJAWS 8GB','(4X2) KIT 2400MHZ DDR4','7','145000'),('VGA','Asus','Asus GTX 1050 ','2GB DDR5 DUAL','8','2675000'),('Processor','INTEL','INTEL CORE I3 4170','LGA 1150','9','1685000');

#
# Structure for table "dbbeli"
#

DROP TABLE IF EXISTS `dbbeli`;
CREATE TABLE `dbbeli` (
  `namapembeli` varchar(255) NOT NULL DEFAULT '',
  `modelbarang` varchar(255) NOT NULL DEFAULT '',
  `kembali` int(11) NOT NULL DEFAULT '0',
  `jumlah` int(11) NOT NULL DEFAULT '0',
  `total` int(11) NOT NULL DEFAULT '0',
  `tanggal` varchar(255) NOT NULL DEFAULT '',
  `harga` int(11) NOT NULL DEFAULT '0',
  `merk` varchar(255) NOT NULL DEFAULT '',
  `namabarang` varchar(255) NOT NULL DEFAULT '',
  `admin` varchar(255) NOT NULL DEFAULT '',
  `tglbyr` varchar(255) NOT NULL DEFAULT '',
  `jam` varchar(255) NOT NULL DEFAULT '',
  `subtotal` int(11) NOT NULL DEFAULT '0',
  `code` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "dbbeli"
#

INSERT INTO `dbbeli` VALUES ('Yusuf','INTEL CORE I3 4170',0,1,1685000,'2019-07-02',1685000,'INTEL','Processor','Ali','02/07/2019','17:26:26',7110000,''),('Yusuf','Asus H170 PRO GAMING',0,1,2750000,'2019-07-02',2750000,'Asus','Motherboard','Ali','02/07/2019','17:26:26',7110000,''),('Arlie','Asus GTX 1050 ',0,1,2675000,'2019-07-15',2675000,'Asus','VGA','Ahmad','15/07/2019','23:19:55',6045000,''),('Arlie','INTEL CORE I3 4170',0,2,3370000,'2019-07-15',1685000,'INTEL','Processor','Ahmad','15/07/2019','23:19:55',6045000,'');

#
# Structure for table "dbuser"
#

DROP TABLE IF EXISTS `dbuser`;
CREATE TABLE `dbuser` (
  `pilih` varchar(255) NOT NULL DEFAULT '',
  `username` varchar(255) NOT NULL DEFAULT '',
  `namadepan` varchar(255) NOT NULL DEFAULT '',
  `namabelakang` varchar(255) NOT NULL DEFAULT '',
  `email` varchar(255) NOT NULL DEFAULT '',
  `kunci` varchar(255) NOT NULL DEFAULT '',
  `tahun` date NOT NULL DEFAULT '0000-00-00',
  `alamat` varchar(255) NOT NULL DEFAULT '',
  `ktp` varchar(255) NOT NULL DEFAULT '',
  `telpon` varchar(255) NOT NULL DEFAULT '',
  `jeniskelamin` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "dbuser"
#

INSERT INTO `dbuser` VALUES ('Admin','Admin','Admin','Admin','Admin','Admin','1997-07-28','Admin','Admin','Admin','Laki-Laki'),('Pemilik Toko','root','Herbanu','Warthakusuma','root','root','1997-07-28','root','root','root','Laki-Laki'),('Admin','test','Ahmad','Sukamto','test','test','2019-07-18','test','test','test','Laki-Laki'),('Admin','user','Putri','Ayu','putriayu@gmail.com','pass','1989-01-24','Tidak Tahu','12345','085689865787','Perempuan');

#
# Structure for table "pemesanan"
#

DROP TABLE IF EXISTS `pemesanan`;
CREATE TABLE `pemesanan` (
  `idbarang` varchar(255) NOT NULL DEFAULT '',
  `supplier` varchar(255) NOT NULL DEFAULT '',
  `komponen` varchar(255) NOT NULL DEFAULT '',
  `merk` varchar(255) NOT NULL DEFAULT '',
  `model` varchar(255) NOT NULL DEFAULT '',
  `tipe` varchar(255) NOT NULL DEFAULT '',
  `jumlah` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "pemesanan"
#

INSERT INTO `pemesanan` VALUES ('001','Kios Komputer','Processor','INTEL','INTEL Core I7','7700K','10');

#
# Structure for table "prdbarang"
#

DROP TABLE IF EXISTS `prdbarang`;
CREATE TABLE `prdbarang` (
  `namabarang` varchar(255) NOT NULL DEFAULT '',
  `merk` varchar(255) NOT NULL DEFAULT '',
  `modelbarang` varchar(255) NOT NULL DEFAULT '',
  `tipe` varchar(255) NOT NULL DEFAULT '',
  `stok` varchar(255) NOT NULL DEFAULT '0',
  `harga` varchar(255) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "prdbarang"
#

INSERT INTO `prdbarang` VALUES ('Processor','AMD','AMD A10 7870K 3.9GHZ','FM2+','3','1525000'),('Processor','AMD','AMD A10 9700K 3.5GHZ 4CORE','Bristol','3','1200000'),('Processor','AMD','AMD A12 9800K 3.8GHZ 4CORE','Bristol','3','1455000'),('Processor','AMD','AMD A4 6300 3.7GHZ ','FM2+','4','465000'),('Processor','AMD','AMD A6 6400K','FM2+','4','560000'),('Processor','AMD','AMD A6 7400K 3.9GHZ','FM2+','2','600000'),('Processor','AMD','AMD A6 9500 3.5GHZ 2CORE','Brisol','3','710000'),('Processor','AMD','AMD A8 7600 3.8GHZ ','FM2+','3','935000'),('Processor','AMD','AMD A8 9600 3.1GHZ 4CORE','Bristol','3','780000'),('Processor','AMD','AMD ATHLON X4 840 3.1GHZ','FM2+','4','925000'),('Processor','AMD','AMD ATHLON X4 860 3.7GHZ ','FM2+','3','750000'),('Processor','AMD','AMD ATHLON X4 880 4.0GHZ','FM2+','3','1200000'),('Processor','AMD','AMD FX 4300 3.8GHZ','AM3+','3','1325000'),('Processor','AMD','AMD FX 6300 3.5GHZ','AM3+','2','1475000'),('Processor','AMD','AMD FX 8320E 3.5GHZ','AM3+','2','1900000'),('Processor','AMD','AMD FX 8350 4.0GHZ','AM3+','3','2700000'),('Processor','AMD','AMD FX 9370 4.4GHZ','AM3+','2','3100000'),('Processor','AMD','AMD RYZEN 3 1200 3.1HZ 4C/4T','AM4','3','1450000'),('Processor','AMD','AMD RYZEN 3 1300X 3.4HZ 4C/4T','AM4','3','1650000'),('Processor','AMD','AMD RYZEN 3 2200 G - 4C/8T','AM4','4','1500000'),('Processor','AMD','AMD RYZEN 5 1400 3.5HZ 4C/8T','AM4','3','2375000'),('Processor','AMD','AMD RYZEN 5 1500X 3.5HZ 4C/8T','AM4','3','2300000'),('Processor','AMD','AMD RYZEN 5 1600 3.2HZ 6C/12T ','AM4','3','2950000'),('Processor','AMD','AMD RYZEN 5 1600X 3.6HZ 6C/12T','AM4','4','3150000'),('Processor','AMD','AMD RYZEN 5 2400 G - 4C/4T','AM4','3','2450000'),('Processor','AMD','AMD RYZEN 5 2600 WITH WRAITH SPRIPE 95W 4.25MHZ 6C/12T','AM4','4','3450000'),('Processor','AMD','AMD RYZEN 5 2600 WITH WRAITH STEALTH 3.9MHZ 6C/12T','AM4','3','3050000'),('Processor','AMD','AMD RYZEN 7 1700 3.0GHZ 8C/16T','AM4','4','4475000'),('Processor','AMD','AMD RYZEN 7 1700X 3.4GHZ 8C/16T','AM4','4','4575000'),('Processor','AMD','AMD RYZEN 7 1800X 3.8GHZ 8C/16T','AM4','4','5200000'),('Processor','AMD','AMD RYZEN 7 2700 WITH PRIMS 4.3MHZ  8C/16T','AM4','4','5100000'),('Processor','AMD','AMD RYZEN 7 2700 WITH WRAITH SPRIPE (LED) 4.1MHZ  8C/16T','AM4','4','4650000'),('Processor','AMD','AMD RYZEN THREADRIPPER 1920X 12C/24T 3.5HZ','TR4','0','11850000'),('Processor','AMD','AMD RYZEN THREADRIPPER 1950X 12C/32T 3.5HZ','TR4','0','14900000'),('Processor','AMD','AMD A12 9800K 3.8GHZ 4CORE','Bristol','3','1455000'),('Motherboard','ASRock','ASRock 970 EXTREME 4','Socket AM3+','4','1270000'),('Motherboard','ASRock','ASRock 970 PRO 3 R2.0','Socket AM3+','2','1200000'),('Motherboard','Asus','Asus H170 PRO GAMING','LGA 1151','7','2750000'),('RAM','ADATA','ADATA XPG 8GB','(4X2) KIT 3000MHZ DDR4','9','1850000'),('RAM','Gskill','Gskill RIPJAWS 8GB','(4X2) KIT 2400MHZ DDR4','7','145000'),('VGA','Asus','Asus GTX 1050 ','2GB DDR5 DUAL','6','2675000'),('Processor','INTEL','INTEL CORE I3 4170','LGA 1150','5','1685000');

#
# Structure for table "simulator"
#

DROP TABLE IF EXISTS `simulator`;
CREATE TABLE `simulator` (
  `nama` varchar(255) NOT NULL DEFAULT '',
  `harga` int(11) NOT NULL DEFAULT '0',
  `komponen` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for table "simulator"
#


#
# Structure for table "supplier"
#

DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `idsupplier` varchar(255) NOT NULL DEFAULT '',
  `namasup` varchar(255) NOT NULL DEFAULT '',
  `telepon` varchar(255) NOT NULL DEFAULT '',
  `alamat` varchar(255) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

#
# Data for table "supplier"
#

INSERT INTO `supplier` VALUES ('001','Kios Komputer','0214478883','Yogyakarta'),('002','Giant Komputer','0217865567','Jakarta');
