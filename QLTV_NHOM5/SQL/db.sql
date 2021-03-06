USE [master]
GO
/****** Object:  Database [QLTV]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE DATABASE [QLTV]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLTV', FILENAME = N'E:\JavaProject\QLTV_NHOM5\SQL\QLTV.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLTV_log', FILENAME = N'E:\JavaProject\QLTV_NHOM5\SQL\QLTV_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QLTV] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLTV].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLTV] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLTV] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLTV] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLTV] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QLTV] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLTV] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLTV] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLTV] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLTV] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLTV] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLTV] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLTV] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLTV] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLTV] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLTV] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLTV] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLTV] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLTV] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLTV] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLTV] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLTV] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLTV] SET  MULTI_USER 
GO
ALTER DATABASE [QLTV] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLTV] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLTV] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLTV] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLTV] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLTV] SET QUERY_STORE = OFF
GO
USE [QLTV]
GO
/****** Object:  User [dbh]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE USER [dbh] FOR LOGIN [dbh] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [dbh]
GO
USE [QLTV]
GO
/****** Object:  Sequence [dbo].[ThemPhieuMuon]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE SEQUENCE [dbo].[ThemPhieuMuon] 
 AS [bigint]
 START WITH 1000
 INCREMENT BY 1
 MINVALUE -9223372036854775808
 MAXVALUE 9223372036854775807
 CACHE 
GO
USE [QLTV]
GO
/****** Object:  Sequence [dbo].[ThemPM]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE SEQUENCE [dbo].[ThemPM] 
 AS [bigint]
 START WITH 1000
 INCREMENT BY 1
 MINVALUE -9223372036854775808
 MAXVALUE 9223372036854775807
 CACHE 
GO
USE [QLTV]
GO
/****** Object:  Sequence [dbo].[ThemSeq]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE SEQUENCE [dbo].[ThemSeq] 
 AS [bigint]
 START WITH 1000
 INCREMENT BY 1
 MINVALUE -9223372036854775808
 MAXVALUE 9223372036854775807
 CACHE 
GO
USE [QLTV]
GO
/****** Object:  Sequence [dbo].[ThemSV]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE SEQUENCE [dbo].[ThemSV] 
 AS [bigint]
 START WITH 1000
 INCREMENT BY 1
 MINVALUE -9223372036854775808
 MAXVALUE 9223372036854775807
 CACHE 
GO
USE [QLTV]
GO
/****** Object:  Sequence [dbo].[ThemTheLoai]    Script Date: 31/05/2021 5:16:02 SA ******/
CREATE SEQUENCE [dbo].[ThemTheLoai] 
 AS [bigint]
 START WITH 1000
 INCREMENT BY 1
 MINVALUE -9223372036854775808
 MAXVALUE 9223372036854775807
 CACHE 
GO
/****** Object:  Table [dbo].[CT_PhieuMua]    Script Date: 31/05/2021 5:16:02 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CT_PhieuMua](
	[MaMua] [varchar](20) NOT NULL,
	[MaSach] [varchar](20) NOT NULL,
	[SoLuong] [int] NULL,
	[TienPhaiTra] [int] NULL,
 CONSTRAINT [PK_PhieuMua_Sach] PRIMARY KEY CLUSTERED 
(
	[MaMua] ASC,
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[CT_PhieuMuon]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[CT_PhieuMuon](
	[MaPhieu] [varchar](20) NULL,
	[MaSach] [varchar](20) NULL,
	[TienCoc] [int] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PhieuMua]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PhieuMua](
	[MaMua] [varchar](20) NOT NULL,
	[NgayDat] [date] NULL,
	[DaTra] [int] NULL,
	[GhiChu] [nvarchar](max) NULL,
	[MaSinhVien] [varchar](20) NULL,
 CONSTRAINT [PK_PhieuMua] PRIMARY KEY CLUSTERED 
(
	[MaMua] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[PhieuMuon]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[PhieuMuon](
	[MaPhieu] [varchar](20) NOT NULL,
	[MaSinhVien] [varchar](20) NOT NULL,
	[NgayMuon] [date] NULL,
	[DaTra] [int] NULL,
	[NgayTra] [date] NULL,
	[GhiChu] [nvarchar](max) NULL,
 CONSTRAINT [PK_PhieuMuon] PRIMARY KEY CLUSTERED 
(
	[MaPhieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[QuanLy]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[QuanLy](
	[TaiKhoan] [varchar](30) NOT NULL,
	[HoTen] [nvarchar](100) NULL,
	[MatKhau] [varchar](20) NULL,
	[CauHoiBM] [nvarchar](max) NULL,
	[TraLoiBM] [nvarchar](max) NULL,
	[SDT] [char](12) NULL,
	[Email] [text] NULL,
 CONSTRAINT [PK_QuanLyThuVien] PRIMARY KEY CLUSTERED 
(
	[TaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Sach]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Sach](
	[MaSach] [varchar](20) NOT NULL,
	[TenSach] [nvarchar](100) NULL,
	[TaiBan] [int] NULL,
	[NhaXuatBan] [nvarchar](50) NULL,
	[MaTheLoai] [varchar](20) NULL,
	[Gia] [int] NULL,
	[SoLuong] [int] NULL,
	[MucDich] [int] NULL,
 CONSTRAINT [PK_Sach] PRIMARY KEY CLUSTERED 
(
	[MaSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[SinhVien](
	[MaSinhVien] [varchar](20) NOT NULL,
	[TenSinhVien] [nvarchar](50) NULL,
	[NganhHoc] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [nchar](5) NULL,
	[SDT] [nchar](12) NULL,
	[Email] [text] NULL,
	[TrangThai] [int] NULL,
 CONSTRAINT [PK_SinhVien] PRIMARY KEY CLUSTERED 
(
	[MaSinhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TheLoai]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TheLoai](
	[MaTheLoai] [varchar](20) NOT NULL,
	[TenTheLoai] [nvarchar](100) NULL,
 CONSTRAINT [PK_TheLoai] PRIMARY KEY CLUSTERED 
(
	[MaTheLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1002', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1003', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1004', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1006', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1007', N'B1011', 8, 160000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1007', N'B1013', 1, 20000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1008', N'B1011', 8, 160000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1008', N'B1013', 1, 20000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1009', N'b1011', 4, 80000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1010', N'B1011', 3, 60000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1010', N'B1013', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1011', N'B1011', 3, 60000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1011', N'B1013', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1012', N'B1011', 3, 60000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1012', N'B1013', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1013', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1014', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1014', N'B1013', 1, 20000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1015', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1016', N'B1011', 2, 40000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1017', N'B1013', 1, 20000)
INSERT [dbo].[CT_PhieuMua] ([MaMua], [MaSach], [SoLuong], [TienPhaiTra]) VALUES (N'PMUA1018', N'B1011', 1, 20000)
GO
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1104', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1105', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1107', N'B1018', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1109', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1110', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1111', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1112', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1113', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1093', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1094', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1097', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1097', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1099', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1099', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1101', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1102', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1114', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1116', N'B1018', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1117', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1121', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1121', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1122', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1125', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1131', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1132', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1132', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1134', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1134', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1136', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1136', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1137', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1138', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1138', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1139', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1142', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1144', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1095', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1115', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1115', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1119', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1120', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1130', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1130', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1100', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1103', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1106', N'B1018', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1118', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1123', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1123', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1096', N'B1012', 200000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1098', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1124', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1124', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1126', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1126', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1128', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1128', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1119', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1127', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1129', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1133', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1135', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1140', N'B1014', 150000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1140', N'B1015', 50000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1141', N'B1016', 20000)
INSERT [dbo].[CT_PhieuMuon] ([MaPhieu], [MaSach], [TienCoc]) VALUES (N'PHIEU1143', N'B1014', 150000)
GO
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1002', CAST(N'2021-05-01' AS Date), 0, N'', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1003', CAST(N'2021-05-01' AS Date), 0, N'', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1004', CAST(N'2021-05-01' AS Date), 0, N'Mua', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1006', CAST(N'2021-05-01' AS Date), 1, N'Mua', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1007', CAST(N'2021-05-01' AS Date), 1, N'Mua sách 2', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1008', CAST(N'2021-05-01' AS Date), 1, N'Đã trả', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1009', CAST(N'2021-05-02' AS Date), 1, N'Chưa trả', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1010', CAST(N'2021-05-02' AS Date), 1, N'Chưa trả', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1011', CAST(N'2021-05-02' AS Date), 0, N'Chưa trả', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1012', CAST(N'2021-05-02' AS Date), 1, N'Chưa trả', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1013', CAST(N'2021-05-02' AS Date), 1, N'', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1014', CAST(N'2021-05-02' AS Date), 1, N'Mua', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1015', CAST(N'2021-05-02' AS Date), 1, N'', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1016', CAST(N'2021-05-16' AS Date), 0, N'', N'SV1050')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1017', CAST(N'2021-05-21' AS Date), 0, N'', N'SV1003')
INSERT [dbo].[PhieuMua] ([MaMua], [NgayDat], [DaTra], [GhiChu], [MaSinhVien]) VALUES (N'PMUA1018', CAST(N'2021-05-21' AS Date), 1, N'', N'SV1003')
GO
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1093', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-06' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1094', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-20' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1095', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-06' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1096', N'sv1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-06' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1097', N'sv1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1098', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-16' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1099', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-16' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1100', N'SV1003', CAST(N'2021-05-06' AS Date), 1, CAST(N'2021-05-16' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1101', N'SV1003', CAST(N'2021-05-16' AS Date), 1, CAST(N'2021-05-16' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1102', N'SV1003', CAST(N'2021-05-16' AS Date), 1, CAST(N'2021-05-20' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1103', N'sv1050', CAST(N'2021-05-16' AS Date), 1, CAST(N'2021-05-16' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1104', N'SV1003', CAST(N'2021-05-20' AS Date), 1, CAST(N'2021-05-21' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1105', N'SV1003', CAST(N'2021-05-20' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1106', N'SV1003', CAST(N'2021-05-21' AS Date), 1, CAST(N'2021-05-21' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1107', N'SV1003', CAST(N'2021-05-21' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1109', N'SV1050', CAST(N'2021-05-25' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1110', N'SV1003', CAST(N'2021-05-25' AS Date), 1, CAST(N'2021-05-26' AS Date), N'Ghi chú 2')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1111', N'SV1003', CAST(N'2021-05-26' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1112', N'SV1003', CAST(N'2021-05-26' AS Date), 0, NULL, N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1113', N'SV1003', CAST(N'2021-05-26' AS Date), 1, CAST(N'2021-05-26' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1114', N'SV1003', CAST(N'2021-05-26' AS Date), 0, NULL, N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1115', N'SV1050', CAST(N'2021-05-26' AS Date), 1, CAST(N'2021-05-27' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1116', N'SV1003', CAST(N'2021-08-08' AS Date), 0, NULL, N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1117', N'SV1003', CAST(N'2021-05-26' AS Date), 0, NULL, N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1118', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú sách')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1119', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú phiếu')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1120', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1121', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'ghi chú phiếu')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1122', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1123', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú về phiếu')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1124', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú phiếu ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1125', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú sách trùng')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1126', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú của thủ thư')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1127', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú trùng')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1128', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1129', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú 2')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1130', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1131', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú trùng')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1132', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú phiếu')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1133', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú trùng sách')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1134', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi Chú')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1135', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú trùng')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1136', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'GHI CHÚ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1137', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1138', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'Ghi chú')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1139', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1140', N'SV1050', CAST(N'2021-05-27' AS Date), 1, CAST(N'2021-05-27' AS Date), N'GHI CHÚ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1141', N'SV1050', CAST(N'2021-05-27' AS Date), 0, NULL, N'')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1142', N'SV1050', CAST(N'2021-05-31' AS Date), 1, CAST(N'2021-05-31' AS Date), N'Ghi chú ')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1143', N'SV1050', CAST(N'2021-05-31' AS Date), 1, CAST(N'2021-05-31' AS Date), N'Ghi chú')
INSERT [dbo].[PhieuMuon] ([MaPhieu], [MaSinhVien], [NgayMuon], [DaTra], [NgayTra], [GhiChu]) VALUES (N'PHIEU1144', N'SV1050', CAST(N'2021-05-31' AS Date), 0, NULL, N'')
GO
INSERT [dbo].[QuanLy] ([TaiKhoan], [HoTen], [MatKhau], [CauHoiBM], [TraLoiBM], [SDT], [Email]) VALUES (N'admin', N'Đỗ Bá Hoàn', N'123456', N'Bố bạn tên gì ?', N'sa', N'122142423   ', N'ac@gmail.com')
INSERT [dbo].[QuanLy] ([TaiKhoan], [HoTen], [MatKhau], [CauHoiBM], [TraLoiBM], [SDT], [Email]) VALUES (N'admin22', N'Nguyễn Tiến Hà', N'123456', N'Bố bạn tên gì ?', N'da', N'05435435543 ', N'abc@gmail.com')
INSERT [dbo].[QuanLy] ([TaiKhoan], [HoTen], [MatKhau], [CauHoiBM], [TraLoiBM], [SDT], [Email]) VALUES (N'admin3', N'Đỗ Bá Hoàn', N'123456', N'Nhân vật yêu thích của bạn ?', N'kk', N'656435342342', N'abc')
INSERT [dbo].[QuanLy] ([TaiKhoan], [HoTen], [MatKhau], [CauHoiBM], [TraLoiBM], [SDT], [Email]) VALUES (N'lvl2000', N'Lê Vũ Long', N'123456', N'Nhân vật yêu thích của bạn ?', N'Yoda', N'1234567890  ', N'abc@gmail.com')
GO
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1011', N'Cậu bé ngốc', 2, N'Kim đồng', N'TL1002', 20000, 11, 0)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1012', N'Chú bé lon ton', 1, N'Long xuyên', N'TL1003', 200000, 29, 1)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1013', N'Khoa học thú vị', 2, N'Kim đồng', N'TL1002', 20000, 1, 0)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1014', N'Chú bé vàng', 3, N'Kim đồng', N'TL1002', 150000, 3, 1)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1015', N'Chị ong nâu', 3, N'Kim đồng', N'TL1003', 50000, 2, 1)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1016', N'Công chúa trong rừng', 2, N'Kim đồng', N'TL1003', 20000, 2, 1)
INSERT [dbo].[Sach] ([MaSach], [TenSach], [TaiBan], [NhaXuatBan], [MaTheLoai], [Gia], [SoLuong], [MucDich]) VALUES (N'B1018', N'Cây đa làng', 3, N'Long long', N'TL1002', 200000, 0, 1)
GO
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1003', N'Đỗ Bá Hoàn', N'Công nghệ thông tin', CAST(N'2021-04-08' AS Date), N'Nam  ', N'543543543   ', N'abc', 0)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1047', N'Lê Vũ Long', N'Du lịch', CAST(N'2021-04-15' AS Date), N'Nam  ', N'0324423423  ', N'lvl@gmail.com', 1)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1050', N'Phạm anh dương', N'Điện tử', CAST(N'2021-04-15' AS Date), N'Nữ   ', N'0354732260  ', N'duongpham@gmail.com', 0)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1052', N'Trần văn huy', N'Công nghệ thông tin', CAST(N'2021-04-07' AS Date), N'Nam  ', N'0445434358  ', N'abc@gmail.com', 1)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1056', N'Hoàng Xuân Hiếu', N'Công nghệ thông tin', CAST(N'2021-05-04' AS Date), N'Nam  ', N'0343949243  ', N'abc@gmail.com', 0)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NganhHoc], [NgaySinh], [GioiTinh], [SDT], [Email], [TrangThai]) VALUES (N'SV1057', N'Hòa 2', N'Công nghệ thông tin', CAST(N'2016-05-04' AS Date), N'Nam  ', N'0123456789  ', N'abc@gmail.com', 0)
GO
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (N'TL1002', N'Văn học')
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (N'TL1003', N'Vui vẻ 2')
INSERT [dbo].[TheLoai] ([MaTheLoai], [TenTheLoai]) VALUES (N'TL1007', N'Không')
GO
ALTER TABLE [dbo].[CT_PhieuMua]  WITH CHECK ADD  CONSTRAINT [fk_PhieuMua_CT_PM] FOREIGN KEY([MaMua])
REFERENCES [dbo].[PhieuMua] ([MaMua])
GO
ALTER TABLE [dbo].[CT_PhieuMua] CHECK CONSTRAINT [fk_PhieuMua_CT_PM]
GO
ALTER TABLE [dbo].[CT_PhieuMua]  WITH CHECK ADD  CONSTRAINT [fk_Sach_CT_PM] FOREIGN KEY([MaSach])
REFERENCES [dbo].[Sach] ([MaSach])
GO
ALTER TABLE [dbo].[CT_PhieuMua] CHECK CONSTRAINT [fk_Sach_CT_PM]
GO
ALTER TABLE [dbo].[CT_PhieuMuon]  WITH CHECK ADD  CONSTRAINT [FK_PHieu_CTPM] FOREIGN KEY([MaPhieu])
REFERENCES [dbo].[PhieuMuon] ([MaPhieu])
GO
ALTER TABLE [dbo].[CT_PhieuMuon] CHECK CONSTRAINT [FK_PHieu_CTPM]
GO
ALTER TABLE [dbo].[CT_PhieuMuon]  WITH CHECK ADD  CONSTRAINT [FK_SACH_PM] FOREIGN KEY([MaSach])
REFERENCES [dbo].[Sach] ([MaSach])
GO
ALTER TABLE [dbo].[CT_PhieuMuon] CHECK CONSTRAINT [FK_SACH_PM]
GO
ALTER TABLE [dbo].[PhieuMua]  WITH CHECK ADD  CONSTRAINT [FK_PHIEUMUA_SV] FOREIGN KEY([MaSinhVien])
REFERENCES [dbo].[SinhVien] ([MaSinhVien])
GO
ALTER TABLE [dbo].[PhieuMua] CHECK CONSTRAINT [FK_PHIEUMUA_SV]
GO
ALTER TABLE [dbo].[PhieuMuon]  WITH CHECK ADD FOREIGN KEY([MaSinhVien])
REFERENCES [dbo].[SinhVien] ([MaSinhVien])
GO
ALTER TABLE [dbo].[Sach]  WITH CHECK ADD  CONSTRAINT [FK_SACH_THELOAI] FOREIGN KEY([MaTheLoai])
REFERENCES [dbo].[TheLoai] ([MaTheLoai])
GO
ALTER TABLE [dbo].[Sach] CHECK CONSTRAINT [FK_SACH_THELOAI]
GO
/****** Object:  StoredProcedure [dbo].[InsertCTPhieuMua]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create proc [dbo].[InsertCTPhieuMua]
  @maMua varchar(20),
  @maSach varchar(20),
  @soLuong int,
  @tienPhaiTra int
as
begin
  insert into CT_PhieuMua
  (
    MaMua, MaSach,SoLuong, TienPhaiTra 
  )values(
    @maMua,
    @maSach,
	@soLuong,
    @tienPhaiTra
  );
end
GO
/****** Object:  StoredProcedure [dbo].[InsertCTPhieuMuon]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[InsertCTPhieuMuon]
  @maPhieu varchar(20),
  @maSach varchar(20),
  @tienCoc int
as
begin
  insert into CT_PhieuMuon
  (
    MaPhieu, MaSach, TienCoc 
  )values(
    @maPhieu,
    @maSach,
    @tienCoc
  );
end
GO
/****** Object:  StoredProcedure [dbo].[InsertInPhieuMua]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[InsertInPhieuMua]
	@maSinhVien varchar(20),
	@ngayDat date,
	@daTra int,
	@ghiChu nvarchar(MAX),
	@maMua varchar(20) out
as
begin
	set @maMua = 'PMUA' + cast(next value for ThemPM as nvarchar(10))
	insert into PhieuMua(MaMua,NgayDat,MaSinhVien, GhiChu,DaTra) values(@maMua,@ngayDat,@maSinhVien,@ghiChu,@daTra)

end
GO
/****** Object:  StoredProcedure [dbo].[InsertInPM]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[InsertInPM]
	@maSinhVien varchar(20),
	@ngayMuon date,
	@daTra int,
	@ghiChu nvarchar(MAX),
	@maPhieu varchar(20) out
as
begin
	set @maPhieu = 'PHIEU' + cast(next value for ThemPhieuMuon as nvarchar(10))
	insert into PhieuMuon(MaPhieu,NgayMuon,MaSinhVien, GhiChu,DaTra) values(@maPhieu,@ngayMuon,@maSinhVien,@ghiChu,@daTra)

end
GO
/****** Object:  StoredProcedure [dbo].[InsertSach]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[InsertSach]
  @tenSach nvarchar(100),
  @taiBan int,
  @nxb nvarchar(50),
  @gia int,
   @maTheLoai varchar(20),
  @soLuong int,
  @mucDich int,
  @maSach varchar(20) out
as
begin
set @maSach = 'B' + cast(next value for ThemSeq as nvarchar(10))
  insert into Sach
  (
    MaSach, TenSach ,TaiBan, NhaXuatBan,  Gia,MaTheLoai, SoLuong,MucDich
  )values(
    @maSach,
    @tenSach,
    @taiBan,
    @nxb,
	@gia,
	@maTheLoai,
	@soLuong,
	@mucDich
  );

if @@ROWCOUNT > 0 begin return 1 end
    else begin return 0 end;
end
GO
/****** Object:  StoredProcedure [dbo].[InsertSinhVien]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[InsertSinhVien]
  @tenSV nvarchar(50),
  @nganhHoc nvarchar(50),
  @ns date,
  @gioiTinh nchar(5),
  @sdt nchar(12),
  @email text,
  @trangThai int,
  @maSV varchar(20) out
as
begin
	set @maSV = 'SV' + cast(next value for ThemSV as nvarchar(10))
  insert into SinhVien
  (
    MaSinhVien, TenSinhVien,NganhHoc, NgaySinh, GioiTinh, SDT, Email,TrangThai
  )values(
    @maSV,
    @tenSV,
    @nganhHoc,
    @ns,
    @gioiTinh,
	@sdt,
	@email,
	@trangThai
  );
if @@ROWCOUNT > 0 begin return 1 end
    else begin return 0 end;
end
GO
/****** Object:  StoredProcedure [dbo].[InsertTheLoai]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[InsertTheLoai]
  @tenTheLoai nvarchar(100),

  @maTheLoai varchar(20) out
as
begin
	set @maTheLoai = 'TL' + cast(next value for ThemTheLoai as nvarchar(10))
  insert into TheLoai
  (
    MaTheLoai, TenTheLoai
  )values(
    @maTheLoai,
    @tenTheLoai
   
  );
if @@ROWCOUNT > 0 begin return 1 end
    else begin return 0 end;
end
GO
/****** Object:  StoredProcedure [dbo].[UpdateSach]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[UpdateSach]

  @tenSach nvarchar(100),
  @taiBan int,
  @nxb nvarchar(50),
  @gia int,
   @maTheLoai varchar(20),
  @soLuong int,
  @maSach varchar(20)
  
as
begin

  update Sach set TenSach = @tenSach, TaiBan = @taiBan, NhaXuatBan = @nxb,  Gia = @gia, MaTheLoai = @maTheLoai, SoLuong = @soLuong where MaSach = @maSach


end
GO
/****** Object:  StoredProcedure [dbo].[UpdateSinhVien]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE proc [dbo].[UpdateSinhVien]
  @tenSV nvarchar(50),
  @nganhHọc nvarchar(50),
  @ns date,
  @gioiTinh nchar(5),
  @sdt nchar(12),
  @email text,
  @trangThai int,
  @maSV varchar(20)
  
as
begin

  update SinhVien set TenSinhVien = @tenSV, NganhHoc = @nganhHọc, NgaySinh = @ns, GioiTinh = @gioiTinh, SDT = @sdt, Email = @email, TrangThai = @trangThai where MaSinhVien = @maSV


end
GO
/****** Object:  StoredProcedure [dbo].[UpdateTheLoai]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create proc [dbo].[UpdateTheLoai]
  @tenTheLoai nvarchar(100),
  @maTheLoai varchar(20)
  
as
begin

  update TheLoai set TenTheLoai = @tenTheLoai where MaTheLoai = @maTheLoai
end
GO
/****** Object:  Trigger [dbo].[TGInsertPMua]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TRIGGER [dbo].[TGInsertPMua] on [dbo].[CT_PhieuMua]
AFTER INSERT
AS 
	begin
	update Sach set SoLuong = Sach.SoLuong - CT_PhieuMua.SoLuong from Sach inner join CT_PhieuMua on Sach.MaSach =  CT_PhieuMua.MaSach inner join inserted on inserted.MaMua =  CT_PhieuMua.MaMua
	end
GO
ALTER TABLE [dbo].[CT_PhieuMua] ENABLE TRIGGER [TGInsertPMua]
GO
/****** Object:  Trigger [dbo].[TGInsertPM]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TRIGGER [dbo].[TGInsertPM] ON [dbo].[CT_PhieuMuon]
FOR INSERT
AS 
	begin
		update Sach set SoLuong = SoLuong - 1 from Sach inner join inserted on Sach.MaSach = inserted.MaSach
	end
GO
ALTER TABLE [dbo].[CT_PhieuMuon] ENABLE TRIGGER [TGInsertPM]
GO
/****** Object:  Trigger [dbo].[TGUpdatePM]    Script Date: 31/05/2021 5:16:03 SA ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TRIGGER [dbo].[TGUpdatePM] ON [dbo].[PhieuMuon]
AFTER UPDATE
AS 
	begin
		if UPDATE(DaTra)
		begin
			update Sach set SoLuong = SoLuong + 1 from Sach inner join CT_PhieuMuon on Sach.MaSach = CT_PhieuMuon.MaSach inner join inserted on inserted.MaPhieu = CT_PhieuMuon.MaPhieu
		end
	end
GO
ALTER TABLE [dbo].[PhieuMuon] ENABLE TRIGGER [TGUpdatePM]
GO
USE [master]
GO
ALTER DATABASE [QLTV] SET  READ_WRITE 
GO
