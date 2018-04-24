using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using StgElse.Models;
using StgElse.Services;
using StgElse.ViewModels;

namespace StgElse.Controllers
{
    [Route("web")]
    public class AttractionWebController : Controller
    {
        private readonly AttractionService attractionService;

        public AttractionWebController(AttractionService attractionService)
        {
            this.attractionService = attractionService;
        }

        [HttpGet("index")]
        public IActionResult Index(int? id)
        {

            AttractionsViewModel attractionsViewModel =  new AttractionsViewModel()
            {
                Selected = null,
                Attractions = attractionService.GetAttractions()
            };

            if (id.HasValue)
            {
                attractionsViewModel.Selected = attractionService.GetById(id.Value);
            }

            return View(attractionsViewModel);
        }

        [HttpPost("add")]
        public IActionResult AddAttractions(Attractions attractions)
        {

            attractionService.SaveAttractions(attractions);

            return RedirectToAction("Index");
        }

        [HttpGet("edit/{id}")]
        public IActionResult AddAttractions(int id)
        {
            string to = "/web/index?id=" + id;
            return Redirect(to);
        }
    }
}